package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TextSizeAdapter(_context: Context, _textSize: Array<Int> ) : BaseAdapter() {

    private val context = _context;
    private val sizeArr = _textSize;

    override fun getCount(): Int {
        return sizeArr.size;
    }

    override fun getItem(position: Int): Any {
        return sizeArr[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) = if(convertView != null) {
            convertView as TextView
        }
        else {
            TextView(context);
        }.apply{
            text = sizeArr[position].toString()
            textSize = 22f;
        }


    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return getView(position, convertView, parent).apply{
            textSize = sizeArr[position].toFloat();
        }
    }

}