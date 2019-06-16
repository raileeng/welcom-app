package com.example.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.v7.widget.SearchView
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {

    lateinit var country list : RecyclerView
            var countries: MutableList<String> = Array ()
            var displaylist: MutableList<String> = Array ()

    fun onCreate(savedInstanceState: Bundle?, loadData: Unit) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData
        country list = findViewById(R.id.country list) as RecyclerView
        country_list.layoutManager = LinearLayoutManager(this)
        country list.layoutManager = GridLayoutManager(context:this, spanCountries)
        country list.adapter = CoutryAdapter (displaylist, ctx: this)
    }
}
override fun  onCreateOptionMenu(menu: Menu?) : Boolean {
    var menuInflater = menu
    menuInflater.inflate(R.menu.main, menu)
    val searchItem = menu.findItem(R.id.action_menu_presenter)
    if (searchItem != null) {
        val searchView = searchItem.actionView as SearchView
        searchView.onQueryTextListener(object = SearchView.OnQueryTextListener)
        override fun onQueryTextListener(query: String?) Boolean {
            return true
        }
        override fun onQueryTextChange(newText = String)
        if(newText.!!.isNotEmpty()) {
            displayList.clear()

            val search: newText.toLowerCase()
            countries.forEach {
                it:String
                if (it.tolowerCase().contains(search))
            }
            displayList.add(it)
            }
            }
            country list.adapter.notifyDataSetChange()
        }else{
            displayList.clear()
            displayList.addall(countries)
            country list.adapter.notifyDataSetChange()
        }
    })

    return super.onCreateOptionsMenu (menu)


    fun loadData(){
    countries.add(Geothermal power)
    countries.add(Hydrogen as fuel cells)
    countries.add(Hydroelectric Energy)
    countries.add(Wind Power)
    countries.add(Solar Energy)
        displaylist.addAll (countries)
    }
}
