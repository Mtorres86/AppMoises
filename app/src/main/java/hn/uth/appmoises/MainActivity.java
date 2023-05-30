package hn.uth.appmoises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
            binding.txtTitulo.setText("Bienvenido "+ binding.edtNombre.getText());
        });

    }
}