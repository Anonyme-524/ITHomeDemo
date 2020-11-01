package com.example.ithomedemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*


class ITAdapter(context: Context, private val resource: Int, data: MutableList<IT>) :
        ArrayAdapter<IT>(context, resource, data) {
    inner class ViewHolder(val ithomeimage: ImageView, val ithomeconsulting: TextView, val ithometime: TextView, val ithomecomment: TextView)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder:ViewHolder
        val view: View
        if (convertView==null){
            view = LayoutInflater.from(context).inflate(resource, parent, false)
            val ithomeimage: ImageView = view.findViewById(R.id.ithomeimage)
            val ithomeconsulting: TextView = view.findViewById(R.id.ithomeconsulting)
            val ithometime: TextView = view.findViewById(R.id.ithometime)
            val ithomecomment : TextView = view.findViewById(R.id.ithomecomment)
            viewHolder = ViewHolder(ithomeimage,ithomeconsulting,ithometime,ithomecomment)
            view.tag = viewHolder
        }else {
            view = convertView
            viewHolder=view.tag as ViewHolder
        }

        val it = getItem(position)
        if (it !=null){
            viewHolder.ithomeimage.setImageResource(it.imageId)
            viewHolder.ithomeconsulting.text = it.consulting
            viewHolder.ithometime.text = it.time
            viewHolder.ithomecomment.text = it.comment
        }
        return view

    }

}