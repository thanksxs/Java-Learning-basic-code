package com.xsun.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 现代 Java 模拟抢红包程序
 */
public class Test1RedEnvelopeSimulator {

    // 使用 JDK 16+ 的 record 声明不可变的数据载体，代码更简洁
    public record Result(boolean success, String message, java.util.List<BigDecimal> amounts) {}

    /**
     * 红包分发核心逻辑
     *
     * @param totalAmount 红包总金额 (M)
     * @param totalPeople 抢红包人数 (N)
     * @return 包含分发状态和金额列表的结果对象
     */
    public static Result distribute(BigDecimal totalAmount, int totalPeople) {
        // 1. 将金额转换为"分"进行整数计算，杜绝浮点数精度问题
        long totalCents = totalAmount.multiply(new BigDecimal("100")).longValue();

        // 2. 校验：M 不足 N 个人抢（每人最少1分钱）
        if (totalCents < totalPeople) {
            String errorMsg = String.format("⚠️ 提示：红包总额（%s元）不足以让 %d 人每人保底 0.01 元！", totalAmount, totalPeople);
            return new Result(false, errorMsg, java.util.List.of());
        }

        var envelopeList = new ArrayList<BigDecimal>(totalPeople);
        long remainCents = totalCents;
        int remainPeople = totalPeople;

        // 3. 核心算法：二倍均值法
        for (int i = 0; i < totalPeople - 1; i++) {
            // 为了保证剩下的人每人至少能拿到 1 分钱，当前人能抽取的最大安全金额
            long maxSafeAmount = remainCents - (remainPeople - 1);

            // 剩余金额的平均值的两倍
            long twiceAverage = (remainCents / remainPeople) * 2;

            // 取两者较小的值作为随机上限，防止"超发"
            long maxBound = Math.min(maxSafeAmount, twiceAverage);

            // 在 [1分, maxBound) 之间生成随机金额。如果 maxBound 兜底到了 1，则直接给 1 分。
            long amount = (maxBound > 1)
                    ? ThreadLocalRandom.current().nextLong(1, maxBound)
                    : 1L;

            envelopeList.add(BigDecimal.valueOf(amount, 2));
            remainCents -= amount;
            remainPeople--;
        }

        // 4. 最后一个人拿走所有剩余的钱（兜底）
        envelopeList.add(BigDecimal.valueOf(remainCents, 2));

        // 5. 将生成的红包列表打乱顺序，彻底消除“最后一个人总是拿兜底金额”的预期规律
        Collections.shuffle(envelopeList);

        return new Result(true, "分配成功", envelopeList);
    }

    public static void main(String[] args) {
        // 使用 var 和 try-with-resources 管理输入流
        try (var scanner = new Scanner(System.in)) {
            System.out.println("🧧 欢迎使用红包模拟器 🧧");

            System.out.print("请输入红包总金额 M (元): ");
            var m = scanner.nextBigDecimal();

            System.out.print("请输入抢红包人数 N: ");
            var n = scanner.nextInt();

            System.out.println("\n" + "-".repeat(35));

            // 执行分配
            var result = distribute(m, n);

            // 处理失败情况（如金额不足）
            if (!result.success()) {
                System.err.println(result.message());
            } else {
                var amounts = result.amounts();
                var maxAmount = Collections.max(amounts); // 找出最大的红包，标记手气最佳
                var sum = BigDecimal.ZERO;

                for (int i = 0; i < amounts.size(); i++) {
                    var amount = amounts.get(i);
                    sum = sum.add(amount);

                    // 判断是否是手气最佳
                    var isBest = amount.compareTo(maxAmount) == 0 ? " 👑 [手气最佳]" : "";
                    System.out.printf("第 %d 人抢到: %6.2f 元%s%n", (i + 1), amount, isBest);
                }

                System.out.println("-".repeat(35));
                System.out.printf("✅ 校验总额: %.2f 元，已全部抢完。%n", sum);
            }
        } catch (Exception e) {
            System.err.println("⚠️ 输入异常，请输入正确的数值类型！");
        }
    }
}