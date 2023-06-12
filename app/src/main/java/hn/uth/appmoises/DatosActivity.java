package hn.uth.appmoises;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hn.uth.appmoises.adapter.AlumnosAdapter;
import hn.uth.appmoises.databinding.ActivityDatosBinding;
import hn.uth.appmoises.entity.Alumno;

public class DatosActivity extends AppCompatActivity {


    private ActivityDatosBinding binding;
    //creamos una variable del tipo clase alumnos adapter para poder tener acceso a esos atributos
    private AlumnosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDatosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });

        List<Alumno> listadoAlumnos=new ArrayList<>();
        listadoAlumnos.add(new Alumno("Jose trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Manuel trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Maria trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Ricardo trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Moises trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Mauricio trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Jose trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Pedro trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Carlos trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Raquel trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Pipe trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Manuel trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Noe trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Salvador trochez","202020202020"));
        listadoAlumnos.add(new Alumno("J trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Pepe trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Jesus trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Estrella trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Joshe trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Arturo trochez","202020202020"));
        listadoAlumnos.add(new Alumno("Benito trochez","202020202020"));

        adapter = new AlumnosAdapter(listadoAlumnos);
       //llamamos al metodo para poder ejecutarlo en el main.
        setupRecycleView();
    }

    //Creamos un metodo para configurar nuestro recycleview
    //nuestro metodo se llama setupRecycleView puede llevar otro nombre
    private void setupRecycleView(){
        //Creamos una instancia
        // esta nos permite del tipo layout
        LinearLayoutManager linearLayout= new LinearLayoutManager(this.getApplicationContext());
        //aqui accederemos al content_layour datos, a traves del id que le hemos asignado
        //si vemos primero accedemos al id "contentlistado" y luego accedemos a los objetos que tiene ese layout. es como un puente.
        //binding.contentlistado.rvDatos.setLayoutManager(linearLayout); aqui le decimos al recycle que tendra el tipo lineal, le seteamos.
        binding.contentlistado.rvDatos.setLayoutManager(linearLayout);
        //aqui le pasamos al recycle view los datos a traves del adapter
        binding.contentlistado.rvDatos.setAdapter(adapter);

    }
}