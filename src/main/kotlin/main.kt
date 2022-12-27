import java.util.Scanner

//Если сумма покупки от 0 до 1 000 рублей, то скидка не предоставляется.
//Если сумма покупки от 1 001 до 10 000 рублей, то скидка составит 100 рублей (как в лекции).
//Если сумма покупки от 10 001 рубля и выше, то скидка составит 5% от суммы.


fun main() {
    val scanner = Scanner(System.`in`)
    val discount: Int = 10000
    val discountPercent = 5


    while (true){
        println("Введите сумму покупки: ")
        var amount = scanner.nextDouble() * 100
        if (amount < 0)
            println("Сумма не может быть отрицательной!")
        else if (amount > 0 && amount < 100100) {
            println("Окончательная сумма составит: ${amount /100} рублей")
        }
        else if (amount > 100100 && amount < 1000001) {
            amount -= discount
            println("Окончательная сумма после скидки составит: ${amount /100} рублей, скидка: ${discount/100} рублей")
        }
        else {
            val discountP = amount / 100 * discountPercent
            amount -= discountP
            amount/=100
            println("Окончательная сумма после скидки составит: $amount рублей, скидка: ${discountP / 100} рублей")
        }
    }
}