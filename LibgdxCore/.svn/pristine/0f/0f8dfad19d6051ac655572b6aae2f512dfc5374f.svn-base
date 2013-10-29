package com.deploy.ligbdx;


import java.util.ArrayList;
import java.util.Iterator;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.List;

public class Deck extends Carta{

private Carta [] DeckdeCarta; // <- Formado por um conjunto de cartas, usaremos isso mais tarde.
public ListaCartas [] RandomCartas = ListaCartas.values(); // Pegando os valores do ListaCartas, contendo todos 
public ListaCartas objetoRandom = RandomCartas[(int)(Math.random() * RandomCartas.length)]; //Usando o random a partir dos valores do Enum.
public ArrayList <ListaCartas> Tipo_da_carta = new ArrayList<ListaCartas>(); // Criei uma lista, pra cada parte da lista conter o Enum, que se transformará em Imagem.
public Integer [] GetWeidth = new Integer[9]; // Toda textura tem que ter suas coordenadas, como só irá mudar o eixo do x, criei um array para armazenar as coordenadas a partir da imagem.
int WeidthCima= 20; // A primeira posição da textura é a 20, que é a lá de cima, daí em diante é só incrementar um valor ao Weidth, pra que as imagens fiquem dentro da moldura.


public void recebimentoCarta(int NumeroDeck)
{
	DeckdeCarta = new Carta[NumeroDeck];
}

//O incremento da Textura.
public void GetWeidthCima()
{
	for (int i = 0; i <=8; i++) {
		GetWeidth[i] = WeidthCima;
		WeidthCima += 152.1;
	}
}

//Nesse for eu adiciono na lista todos os randons das cartas.
public void DeckNaMao()
{
	for (int i = 0; i <= 17; i++) 
	{
		ListaCartas objeto = RandomCartas[(int)(Math.random() * RandomCartas.length)]; // Observe que eu tive que criar dois objetos!
		objetoRandom = objeto; //Tive que colocar isso, porque o random só é instanciado dentro de um laço, porque se não só iria randomar uma vez.
		Tipo_da_carta.add(objetoRandom); //Adicionando na lista.
	}
}


}
