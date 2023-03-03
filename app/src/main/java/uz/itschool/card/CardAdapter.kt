package uz.itschool.card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(var cardList: MutableList<Card>) : RecyclerView.Adapter<CardAdapter.MyHolder>() {

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardName1: TextView = itemView.findViewById(R.id.cardTypeText1)
        val cardName2: TextView = itemView.findViewById(R.id.cardTypeText2)
        val number: TextView = itemView.findViewById(R.id.cardNumber)
        val owner: TextView = itemView.findViewById(R.id.ownerName)
        val expirationDate: TextView = itemView.findViewById(R.id.expirationDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val card = cardList[position]
        holder.cardName1.text = card.cardType.name
        holder.cardName2.text = card.cardType.name
        holder.number.text = card.number
        holder.owner.text = card.owner
        holder.expirationDate.text = card.date
    }

    override fun getItemCount(): Int {
        return cardList.size
    }
}