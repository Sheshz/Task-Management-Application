package com.example.taskmaster


object DataObject {
    val listdata= mutableListOf<BoxInfo>()

    fun setData(title: String, priority: String){
        listdata.add(BoxInfo(title,priority))
    }

    fun getAllData(): List<BoxInfo>{
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): BoxInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority:String){
        listdata[pos].title=title
        listdata[pos].priority=priority
    }
}