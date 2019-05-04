class TableauPile(var cards: MutableList<Cards>) {
    init {
        cards.last().faceUp = true
    }

    fun addCards(newCards: MutableList<Card>): Boolean {
        if (!(newCards.first().value != cards.last().value - 1 && suitCheck(newCards.first, cards.last()))
    }
}