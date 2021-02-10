package com.mariugo.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] estados = {
            "Acre (AC)",
            "Alagoas (AL)",
            "Amapá (AP)",
            "Amazonas (AM)",
            "Bahia (BA)",
            "Ceará (CE)",
            "Distrito Federal (DF)",
            "Espírito Santo (ES)",
            "Goiás (GO)",
            "Maranhão (MA)",
            "Mato Grosso (MT)",
            "Matro Grosso do Sul (MS)",
            "Minas Gerais (MG)",
            "Pará (PA)",
            "Paraíba (PB)",
            "Paraná (PR)",
            "Pernambuco (PE)",
            "Piauí (PI)",
            "Rio de Janeiro (RJ)",
            "Rio Grande do Norte (RN)",
            "Rio Grande do Sul (RS)",
            "Rondônia (RP)",
            "Roraíma (RR)",
            "Santa Catarina (SC)",
            "São Paulo (SP)",
            "Sergipe (SE)",
            "Tocantins (TO)"
    };

    String[] capitais = {
            "Rio Branco",
            "Maceió",
            "Macapá",
            "Manaus",
            "Salvador",
            "Fortaleza",
            "Brasília",
            "Vitória",
            "Goiânia",
            "São Luís",
            "Cuiabá",
            "Campo Grande",
            "Belo Horizonte",
            "Belém",
            "João Pessoa",
            "Curitiba",
            "Recife",
            "Teresina",
            "Rio de Janeiro",
            "Natal",
            "Porto Alegre",
            "Porto Velho",
            "Boa Vista",
            "Florianópolis",
            "São Paulo",
            "Aracajú",
            "Palmas"
    };

    String[] populacao = {
            "População: 894,70",
            "População: 3.354,443",
            "População: 861,773",
            "População: 4.228,381",
            "População: 14.930,634",
            "População: 9.187,103",
            "População: 3.055,149",
            "População: 4.064,052",
            "População: 7.142,070",
            "População: 7.127,460",
            "População: 3.526,220",
            "População: 2.809,394",
            "População: 21.331,292",
            "População: 8.360,745",
            "População: 7.039,277",
            "População: 11.516,840",
            "População: 9.616,621",
            "População: 3.281,480",
            "População: 17.366,189",
            "População: 3.534,165",
            "População: 2.809,34",
            "População: 1.796,460",
            "População: 631,181",
            "População: 7.279,638",
            "População: 46.289,333",
            "População: 2.318,322",
            "População: 1.590,248"
    };

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcwEstados);
        recyclerView.setAdapter(new AdapterEstados(estados, capitais));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }

    private int getBrasao(int position) {
        int intBrasao = R.mipmap.ic_launcher;
        switch (position) {
            case 0:
                intBrasao = R.drawable.a;
                break;
            case 1:
                intBrasao = R.drawable.b;
                break;
            case 2:
                intBrasao = R.drawable.c;
                break;
            case 3:
                intBrasao = R.drawable.d;
                break;
            case 4:
                intBrasao = R.drawable.e;
                break;
            case 5:
                intBrasao = R.drawable.f;
                break;
            case 6:
                intBrasao = R.drawable.g;
                break;
            case 7:
                intBrasao = R.drawable.h;
                break;
            case 8:
                intBrasao = R.drawable.i;
                break;
            case 9:
                intBrasao = R.drawable.j;
                break;
            case 10:
                intBrasao = R.drawable.k;
                break;
            case 11:
                intBrasao = R.drawable.l;
                break;
            case 12:
                intBrasao = R.drawable.m;
                break;
            case 13:
                intBrasao = R.drawable.n;
                break;
            case 14:
                intBrasao = R.drawable.o;
                break;
            case 15:
                intBrasao = R.drawable.p;
                break;
            case 16:
                intBrasao = R.drawable.q;
                break;
            case 17:
                intBrasao = R.drawable.r;
                break;
            case 18:
                intBrasao = R.drawable.s;
                break;
            case 19:
                intBrasao = R.drawable.t;
                break;
            case 20:
                intBrasao = R.drawable.u;
                break;
            case 21:
                intBrasao = R.drawable.v;
                break;
            case 22:
                intBrasao = R.drawable.w;
                break;
            case 23:
                intBrasao = R.drawable.x;
                break;
            case 24:
                intBrasao = R.drawable.y;
                break;
            case 25:
                intBrasao = R.drawable.z;
                break;
            case 26:
                intBrasao = R.drawable.zz;
                break;
        }
        return intBrasao;
    }

    public class AdapterEstados extends RecyclerView.Adapter {

        String[] estados, capitais;

        public AdapterEstados(String[] estados, String[] capitais) {
            this.estados = estados;
            this.capitais = capitais;
        }

        public class ViewHolderEstados extends RecyclerView.ViewHolder {

            TextView tvwEstado, tvwCapital, tvwPopulacao;
            ImageView imgBrasao;
            Button btnInfo;
            ConstraintLayout constraintLayout;

            public ViewHolderEstados(@NonNull View itemView) {
                super(itemView);
                tvwEstado = itemView.findViewById(R.id.tvEstado);
                tvwCapital = itemView.findViewById(R.id.tvCapital);
                tvwPopulacao = itemView.findViewById(R.id.tvPopulacao);
                imgBrasao = itemView.findViewById(R.id.imageView);
                btnInfo = itemView.findViewById(R.id.btnInfo);
                constraintLayout = itemView.findViewById(R.id.consLayout);
                //tvwPopulacao.setVisibility(View.GONE);

                btnInfo.setOnClickListener(v -> {
                    if (constraintLayout.getVisibility() == View.VISIBLE){
                        constraintLayout.setVisibility(View.GONE);
                    } else {
                        constraintLayout.setVisibility(View.VISIBLE);
                    }
                });
            }
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getApplicationContext()).
                    inflate(R.layout.row_recyclerview, parent, false);
            return new ViewHolderEstados(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((ViewHolderEstados) holder).tvwEstado.setText(estados[position]);
            ((ViewHolderEstados) holder).tvwCapital.setText(capitais[position]);
            ((ViewHolderEstados) holder).imgBrasao.setImageResource(getBrasao(position));
            ((ViewHolderEstados) holder).constraintLayout.setVisibility(View.GONE);
            ((ViewHolderEstados) holder).tvwPopulacao.setText(populacao[position]);

        }

        @Override
        public int getItemCount() {
            return estados.length;
        }
    }
}