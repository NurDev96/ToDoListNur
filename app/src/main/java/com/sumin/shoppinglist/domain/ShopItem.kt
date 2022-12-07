package com.sumin.shoppinglist.domain
// Основа бизнес логики
// Клас для работы с ИД, Названием, Количеством и Активностью


data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}


// Возможности каторые нам необходимы дальнейшом:
// Получать
// Добовлять
// Удолять
// Редактировать

// ###### SOLID - ########
// S - single responsibility. Принцып единой отвенственности. Для каждого действия создаетса отдельный клас
// Эти классы называются Interactor (Use Case) - класс который отвечяет а одно действие в бизнес логике
//
//