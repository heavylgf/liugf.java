package com.zhss.designpattern.template;

/**
 * 模板方法模式
 * Created by CTWLPC on 2018/8/14.
 */
public class TemplateMethodPatterDemo {

    public static void main(String[] args) {
        DiscountCalculator discountCalculator1 = new DiscountCalculator1();
        discountCalculator1.calculate();

        DiscountCalculator discountCalculator2 = new DiscountCalculator2();
        discountCalculator2.calculate();

        DiscountCalculator discountCalculator3 = new DiscountCalculator3();
        discountCalculator3.calculate();

    }

    /**
     * 通用的计算逻辑接口
     */
    public interface DiscountCalculator{

        void calculate();

    }

    /**
     * 模板方法实现的精华所在
     */
    public static abstract class AbstractDiscountCalculator implements DiscountCalculator{

        @Override
        public void calculate() {
            // 完成通用的计算逻辑
            commonCalculate();
            // 完成特殊的计算逻辑
            specificCalculate();
        }

        private void commonCalculate(){
            System.out.println("通用的计算逻辑，修改了一下");
        }

        // 定义抽象方法
        protected abstract void specificCalculate();

    }

    public static class DiscountCalculator1 extends AbstractDiscountCalculator{

        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器 1 的特殊计算逻辑");
        }

    }

    public static class DiscountCalculator2 extends AbstractDiscountCalculator{

        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器 2 的特殊计算逻辑");
        }

    }

    public static class DiscountCalculator3 extends AbstractDiscountCalculator{

        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器 3 的特殊计算逻辑");
        }

    }

}
