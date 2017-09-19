package com.example.sanjana.cups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;
    Button new_game;
    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);
        new_game = (Button) findViewById(R.id.new_game);

        cards = new ArrayList<>();
        cards.add(107);
        cards.add(207);
        cards.add(407);

        Collections.shuffle(cards);

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.cardback);
                middle.setImageResource(R.drawable.cardback);
                right.setImageResource(R.drawable.cardback);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.ace_spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if (cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if (cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if (cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if (cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }
            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.ace_spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if (cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if (cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if (cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.ace_spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if (cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if (cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if (cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.ace_spades);
                } else if (cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if (cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }
            }
        });
    }
}
