package thiengo.com.br.pokdex

import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detalhes.*
import kotlinx.android.synthetic.main.content_detalhes.*
import thiengo.com.br.pokdex.domain.Pokemon


class DetalhesActivity :
        AppCompatActivity() {

    var pokemon : Pokemon? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)
        setSupportActionBar(toolbar)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)

        fab.setOnClickListener {
            customToast()
        }

        ct_layout.setCollapsedTitleTypeface( ResourcesCompat.getFont(this, R.font.pokemon_solid) )
        ct_layout.setExpandedTitleTypeface( ResourcesCompat.getFont(this, R.font.pokemon_solid) )

        pokemon = intent.getParcelableExtra<Pokemon>(Pokemon.KEY)
        iv_header.setImageResource( pokemon?.imagemRes ?: 0 )
        tv_descricao.text = pokemon?.descricao
        tv_numero.text = pokemon?.numero.toString().padStart(3, '0')
        tv_altura.text = pokemon?.altura
        tv_peso.text = pokemon?.peso
        tv_sexo.text = pokemon?.sexo
        tv_categoria.text = pokemon?.categoria
        tv_habilidades.text = pokemon?.getHabilidadesFormatado()
        tv_tipo.text = pokemon?.getTipoFormatado()
        tv_fraquezas.text = pokemon?.getFraquezasFormatado()
    }

    override fun onResume() {
        super.onResume()
        toolbar.title = pokemon?.nome
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun customToast(){
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.toast_custom,
                findViewById<ViewGroup>(R.id.custom_toast_container) )

        val text = layout.findViewById<TextView>(R.id.text)
        text.text = "Ainda falta implementar esta parte"
        text.typeface = ResourcesCompat.getFont(this@DetalhesActivity, R.font.pokemon_solid)

        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }
}