package ffos.msvoboda_19.ontologijaPutovanja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//Za zakomentiratu Filter metodu treba vratiti "implements Filterable"
public class AdapterGradovi extends RecyclerView.Adapter<AdapterGradovi.Red>  {

    private List<Gradovi> podaci;
    private List<Gradovi> noviPodaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterGradovi(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        noviPodaci = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.red_u_listi, roditelj, false);
        return new Red(view);
    }


    @Override
    public void onBindViewHolder(Red red, int position) {
        Gradovi g = podaci.get(position);

        red.nazivDrzave.setText(g.getNazivDrzave());
        red.nazivGrada.setText(g.getNazivGrada());
        red.godina.setText(g.getGodina());
        red.biljeska.setText(g.getBiljeska());

    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }


    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView nazivDrzave;
        private TextView nazivGrada;
        private TextView godina;
        private TextView biljeska;

        Red(View itemView) {
            super(itemView);

            nazivDrzave = itemView.findViewById(R.id.drzava);
            nazivGrada = itemView.findViewById(R.id.grad);
            godina = itemView.findViewById(R.id.godina);
            biljeska = itemView.findViewById(R.id.biljeska);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public Gradovi getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Gradovi> itemList) {
        this.podaci = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};



