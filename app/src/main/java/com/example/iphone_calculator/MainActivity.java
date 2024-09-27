package com.example.iphone_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button but_0, but_1, but_2, but_3, but_4, but_5, but_6, but_7, but_8, but_9;
Button but_pun, but_sumar, but_restar, but_dividir, but_multiplicar, but_igual, but_c, but_porciento, but_porcineto2;
TextView result;
String part_one_num = "";
String part_two_num = "";
String View = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_0 = findViewById(R.id.bt_cero);
        but_1 = findViewById(R.id.bt_1);
        but_2 = findViewById(R.id.bt_2);
        but_3 = findViewById(R.id.bt_3);
        but_4 = findViewById(R.id.bt_4);
        but_5 = findViewById(R.id.bt_5);
        but_6 = findViewById(R.id.bt_6);
        but_7 = findViewById(R.id.bt_7);
        but_8 = findViewById(R.id.bt_8);
        but_9 = findViewById(R.id.bt_9);

        but_sumar = findViewById(R.id.bt_mas);
        but_restar = findViewById(R.id.bt_menos);
        but_dividir = findViewById(R.id.bt_dividir);
        but_multiplicar = findViewById(R.id.bt_por);
        but_igual = findViewById(R.id.bt_igual);
        but_c = findViewById(R.id.bt_c);
        but_porciento = findViewById(R.id.bt_porciento);
        but_porcineto2 = findViewById(R.id.bt_porcineto2);
        result = findViewById(R.id.text_cero);
        but_pun = findViewById(R.id.bt_punto);
        c_met();





        };

    public void c_met(){
        part_one_num = "";
        part_two_num = "";
        View = "";
        result.setText("0");

        but_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                c_met();
            }
        });

        but_pun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                if(View == ""){

                }
                else{
                    String numero = ".";
                    View = View + numero;
                    part_one_num = part_one_num + numero;
                    resultado_pantalla();
                }

            }
        });

        but_porcineto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "-";
                View = numero + View;
                part_one_num = numero + part_one_num;
                resultado_pantalla();

            }
        });

        but_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                if(View == ""){

                }
                else{
                    String numero = "0";
                    View = View + numero;
                    part_one_num = part_one_num + numero;
                    resultado_pantalla();
                }


            }
        });


        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = "1";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = "2";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "3";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "4";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "5";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "6";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "7";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "8";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });

        but_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String numero = "9";
                View = View + numero;
                part_one_num = part_one_num + numero;
                resultado_pantalla();
            }
        });



        //es la otra parte de los numeros cuando se precione el boton sumar
        but_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                View = "";
                resultado_pantalla();

                but_pun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = ".";
                            View = View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });


                but_0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = "0";
                            View =  View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });

                but_porcineto2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "-";
                        View = numero + View;
                        part_two_num = numero + part_two_num;
                        resultado_pantalla();

                    }
                });

                but_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "1";
                        View =  View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();

                    }
                });
                but_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "2";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "3";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "4";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "5";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "6";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "7";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "8";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "9";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        c_met();
                    }
                });

                but_igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        try {
                            double part1 = Double.parseDouble(part_one_num);
                            double part2 = Double.parseDouble(part_two_num);
                            double sum = part1 + part2;
                            View = String.valueOf(sum);
                            resultado_pantalla();

                            but_c.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(android.view.View view) {
                                    c_met();
                                }
                            });


                        }
                        catch (Exception ex){
                            Toast.makeText(getApplicationContext(), "erro: " + ex , Toast.LENGTH_SHORT).show();

                        }

                    }
                });
            }
        });

        but_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                View = "";
                resultado_pantalla();

                but_pun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = ".";
                            View = View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });

                but_0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = "0";
                            View =  View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });

                but_porcineto2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "-";
                        View = numero + View;
                        part_two_num = numero + part_two_num;
                        resultado_pantalla();

                    }
                });
                but_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "1";
                        View =  View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();

                    }
                });
                but_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "2";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "3";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "4";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "5";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "6";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "7";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "8";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "9";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        c_met();
                    }
                });

                but_igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        try {
                            double part1 = Double.parseDouble(part_one_num);
                            double part2 = Double.parseDouble(part_two_num);
                            double sum = part1 - part2;
                            View = String.valueOf(sum);
                            resultado_pantalla();

                            but_c.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(android.view.View view) {
                                    c_met();
                                }
                            });


                        }
                        catch (Exception ex){
                            Toast.makeText(getApplicationContext(), "erro: " + ex , Toast.LENGTH_SHORT).show();

                        }

                    }
                });
            }
        });

        but_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                View = "";
                resultado_pantalla();

                but_pun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = ".";
                            View = View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });

                but_0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = "0";
                            View =  View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });
                but_porcineto2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "-";
                        View = numero + View;
                        part_two_num = numero + part_two_num;
                        resultado_pantalla();

                    }
                });

                but_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "1";
                        View =  View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();

                    }
                });
                but_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "2";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "3";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "4";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "5";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "6";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "7";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "8";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "9";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        c_met();
                    }
                });

                but_igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        try {
                            double part1 = Double.parseDouble(part_one_num);
                            double part2 = Double.parseDouble(part_two_num);
                            double sum = part1 * part2;
                            View = String.valueOf(sum);
                            resultado_pantalla();

                            but_c.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(android.view.View view) {
                                    c_met();
                                }
                            });


                        }
                        catch (Exception ex){
                            Toast.makeText(getApplicationContext(), "erro: " + ex , Toast.LENGTH_SHORT).show();

                        }

                    }
                });
            }
        });

        but_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                View = "";
                resultado_pantalla();

                but_pun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = ".";
                            View = View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });

                but_0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        if(View == ""){

                        }
                        else{
                            String numero = "0";
                            View =  View + numero;
                            part_two_num = part_two_num + numero;
                            resultado_pantalla();
                        }

                    }
                });
                but_porcineto2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "-";
                        View = numero + View;
                        part_two_num = numero + part_two_num;
                        resultado_pantalla();

                    }
                });

                but_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "1";
                        View =  View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();

                    }
                });
                but_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "2";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "3";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "4";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "5";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "6";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "7";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "8";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        String numero = "9";
                        View = View + numero;
                        part_two_num = part_two_num + numero;
                        resultado_pantalla();
                    }
                });

                but_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        c_met();
                    }
                });

                but_igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View view) {
                        try {
                            double part1 = Double.parseDouble(part_one_num);
                            double part2 = Double.parseDouble(part_two_num);
                            double sum = part1 / part2;
                            View = String.valueOf(sum);
                            resultado_pantalla();

                            but_c.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(android.view.View view) {
                                    c_met();
                                }
                            });


                        }
                        catch (Exception ex){
                            Toast.makeText(getApplicationContext(), "erro: " + ex , Toast.LENGTH_SHORT).show();

                        }

                    }
                });
            }
        });

    }

    public void resultado_pantalla()

    {
        result.setText(View);
    }
}