package hn.uth.appmoises.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hn.uth.appmoises.databinding.ItemAlumnoBinding;
import hn.uth.appmoises.entity.Alumno;

//aqui creamos una herencias.recordemos que las herencias, traen variables de una clase y las utilizamos aqui con nuevas
//En resumen, onCreateViewHolder() se encarga de crear y retornar la instancia del ViewHolder,
// onBindViewHolder() se encarga de enlazar los datos a los elementos de la vista del ViewHolder y
// getItemCount() devuelve el número total de elementos en la lista.
public class AlumnosAdapter extends RecyclerView.Adapter<AlumnosAdapter.ViewHolder> {
    //declramos variables que vamos a neceesitar
    private List<Alumno> dataset;
//creamos un constructor para generar los datos de la lista
    public AlumnosAdapter(List<Alumno> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public AlumnosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //aqui asociamos los objetos que se tiene en el layout item_alumno
        //este metodo siemprte tendra esstas 2 lineas lo unico que cambiara es  "nombredellayoutasociado+Binding"
        //para acceder a los controles del item alumno usaremos una clase que se crea sola al crear el layout. como
        // como el layout se llama item la clase lleva el mismo nombre y con el agregado bindinge;
        //en este codigo le decimos que la variable binding tendra toda la informacion que esta en el contexto del layout item alumno
        //le decimos con la propiedad inflate que la rellene de todos los datos que encunetre en el context.
        ItemAlumnoBinding binding = ItemAlumnoBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        //aqui retornamos al holder los datos que hemos encontrado en el binding
        return new ViewHolder(binding);

        //en resumen hemos creado un enlace para acceder al layout item alumno y si encuentra informacion lo guardara en la variable bindin

    }

    @Override
    public void onBindViewHolder(@NonNull AlumnosAdapter.ViewHolder holder, int position) {
        //aqui programamos la informacion que mostraremos en el recycleview
        //hemos creado una variable llamada alumnoactual y lo llenamos con el dataset de nuestra lista <Alumno>
        // el atributo posicion, nos va a dar la posicion donde se pintara la informacionn
        Alumno alumnoActual = dataset.get(position);
        //aqui hemos accedido al objeto txtnombre y le pasamos el parametro que contiene el alumno avtual
        holder.binding.txtNombre.setText(alumnoActual.getNombre());
        holder.binding.txtCuenta.setText(alumnoActual.getCuenta());


    }

    @Override
    public int getItemCount() {
        return 0;
        //quie programaos cuentos registros queremos que se muestren en la pantall
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //creamos una variable del tipo de la clase Item
        //esta clase sera igual para todos los demas, lo unico que cambiara sera el nombre item alumno por el nombre del layuot
        ItemAlumnoBinding binding;

        public ViewHolder(ItemAlumnoBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
            //aqui controlamos el evento clic. esto no ira programado.
        }
    }
}

