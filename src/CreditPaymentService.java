public class CreditPaymentService {
    public int calculate(double sum, double months) {
        double percent = 9.99;
        double monthpercent = (percent / 12) / 100; // месячный процент приведенный к нужному значению для формулы
        double degree = Math.pow((1 + monthpercent), months); // возведение в степень, что бы не грамоздить формулу
        double coeff = (monthpercent * degree) / (degree - 1); // Коэффициент
        double payment = sum * coeff; // Расчета ежемесячного платежа
        return (int) payment;
    }
}
