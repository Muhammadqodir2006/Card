package uz.itschool.card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.adapter = CardAdapter(getCards())
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)



    }
    fun getCards(): MutableList<Card> {
        var cardList = mutableListOf<Card>()
        cardList.add(Card("1234 5678 9011", "Jim Cook", "12/26", CardType.UZCARD))
        cardList.add(Card("1234 5678 9011", "Jim Cook", "12/26", CardType.HUMO))
        cardList.add(Card("1234 5678 9011", "Jim Cook", "12/26", CardType.MASTERCARD))
        cardList.add(Card("1234 5678 9011", "Jim Cook", "12/26", CardType.VISA))
        return cardList
    }


}