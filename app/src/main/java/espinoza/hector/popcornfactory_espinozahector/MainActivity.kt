package espinoza.hector.popcornfactory_espinozahector

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intento: Intent = Intent(this, CatalogActivity::class.java)

        val boton: Button = findViewById(R.id.button) as Button

        boton.setOnClickListener {
            startActivity(intento)
        }



    }


}