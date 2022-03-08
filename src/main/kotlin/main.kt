const val DISCOUNT_1_LIMIT = 1_001
const val DISCOUNT_1_RUB = 100
const val DISCOUNT_2_LIMIT = 10_001
const val DISCOUNT_2_PERCENT = 5
const val DISCOUNT_CUSTOMER_PERCENT = 1

fun main() {

    val customer = true
    val previousBuy = 10_000

    val currentBuy = 1_000

    val discountTrade = if (previousBuy >= DISCOUNT_2_LIMIT) {
        (currentBuy * DISCOUNT_2_PERCENT) / 100
    } else if (previousBuy >= DISCOUNT_1_LIMIT) {
        DISCOUNT_1_RUB
    } else 0

    val discountCustomer = if (customer) {
        (currentBuy - discountTrade) * DISCOUNT_CUSTOMER_PERCENT / 100
    } else 0

    println("Текущая сумма покупки: $currentBuy руб., предыдущая сумма покупок: $previousBuy руб.")
    println("Cкидка за предыдущие покупки: $discountTrade руб., скидка постоянному поупателю: $discountCustomer руб.")
    println("Сумма покупки с учетом всех скидок: ${currentBuy - discountTrade - discountCustomer} руб.")

}