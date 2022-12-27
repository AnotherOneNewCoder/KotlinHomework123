import java.util.Scanner

//Если сумма покупки от 0 до 1 000 рублей, то скидка не предоставляется.
//Если сумма покупки от 1 001 до 10 000 рублей, то скидка составит 100 рублей (как в лекции).
//Если сумма покупки от 10 001 рубля и выше, то скидка составит 5% от суммы.


fun main() {
    val scanner = Scanner(System.`in`)
    val discount: Int = 1000
    val discountPercent = 5


    while (true){
        var amount = scanner.nextDouble() * 100
        if (amount < 0)
            println("Сумма не может быть отрицательной!")
        else if (amount > 0 && amount < 1000001) {
            amount -= discount /100
            println("Окончательная сумма после скидки составит: $amount рублей")
        }
        else {
            amount -= (amount / 100 * discountPercent)
            amount/=100
            println("Окончательная сумма после скидки составит: $amount рублей")
        }
    }
}