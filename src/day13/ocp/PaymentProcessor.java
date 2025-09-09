package day13.ocp;

/**
 * OCP 원칙을 지키도록 리팩토링
 */
public class PaymentProcessor {
    public void processPayment(String type, double amount) {
        if ("CREDIT_CARD".equals(type)) {
            // 신용카드 결제
        } else if ("PAYPAL".equals(type)) {
            // PayPal 결제
        }
        // 새로운 결제 방식 추가 시 여기를 수정해야 함
    }
}