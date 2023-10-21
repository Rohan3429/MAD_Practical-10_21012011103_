package com.example.mad_practical_10_21012011103

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ContactAdapter(context:Context,val array:ArrayList<Contact> ):ArrayAdapter<Contact>(context,0,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.data_item,parent,false)
        view.findViewById<TextView>(R.id.name1).text=array.get(position).name
        view.findViewById<TextView>(R.id.no1).text=array.get(position).phoneno
        view.findViewById<TextView>(R.id.email1).text=array.get(position).emailid
        view.findViewById<TextView>(R.id.address1).text=array.get(position).address

        return view
    }
}