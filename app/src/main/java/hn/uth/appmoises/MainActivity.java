package hn.uth.appmoises;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import hn.uth.appmoises.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Intanciamos aqui instanciamos nuestro layout y se lo asigamos a una variable para poder aprovecar los recursos que hemos declardo en el layout
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //a partir de aqui podemos acceder a los objetos creados en el lyout
        binding.btnSaludar.setOnClickListener(v ->{
            //aqui condicionamos si un valor esta vacio nos enviara un mensaje
            if(binding.edtNombre.getText().toString().isEmpty()){
                //este codigo salio del recurso de la pagina android
                //a nuestro layour le ponemos un Id para acceder a al a treves de nuestro bindin
                //creamos string en el area de string del mensjae del error. para que cuando no coloqyemos el nombre le nos muestre el error
                Snackbar.make(binding.layoutBievenida, R.string.mensaje_error_nombre,
                                Snackbar.LENGTH_LONG)
                        .show();
            }
            else {
                String mensajeBienvenida = getString(R.string.mensaje_bienvenida, binding.edtNombre.getText());
                binding.txtTitulo.setText(mensajeBienvenida);
            }

        });

    }
}