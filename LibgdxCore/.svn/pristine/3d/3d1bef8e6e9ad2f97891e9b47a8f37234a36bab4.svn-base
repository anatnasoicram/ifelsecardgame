package com.deploy.ligbdx;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class GameRoot implements ApplicationListener {
	Texture branco, fila, cafe;
	public SpriteBatch batch; // O spriteBatch é o responsável pela renderização na tela.
	private Texture texture;
	Deck deck = new Deck();
	Texture [] VetorTextura = new Texture[18];
	
	//Nesse método, compara-se o elemento da lista com cara um dos elementos do Enum. Se for igual, é guardado num vetor de textura para a impressão.
	public void RecebendoTextura()
	{
		for (int i = 0; i <= 17; i++) 
		{
			if(deck.Tipo_da_carta.get(i) == ListaCartas.Branco)
			{
				VetorTextura[i] = branco;
			}
			if(deck.Tipo_da_carta.get(i)== ListaCartas.Cafe)
			{
				VetorTextura[i] = cafe;
			}
			if(deck.Tipo_da_carta.get(i)== ListaCartas.Fila)
			{
				VetorTextura[i] = fila;
			}
		}
	}
	
	public void create() {
		// TODO Auto-generated method stub
		batch = new SpriteBatch();
		texture = new Texture("Game.png");
		branco = new Texture("Carta1.png");
		fila = new Texture("Carta2.png");
		cafe = new Texture("Carta3.png");
		deck.DeckNaMao();
		RecebendoTextura();
		deck.GetWeidthCima();
	}

	@Override
	//Ainda n sei pra quê serve isso. huheuhuehehueheuhuehue
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
		texture.dispose();
		branco.dispose();
		fila.dispose();
		cafe.dispose();
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	//Método de impressão das imagens.
	public void render() {
		// TODO Auto-generated method stu
		batch.begin();
		batch.draw(texture,0,0);
		int j = 7;
		//--------------- IMPRIMINDO CARTAS INICIAIS DO JOGO RANDOMICAMENTE ----------------------------------
		for (int i = 0; i <=8; i++) {
			  batch.draw(VetorTextura[i], deck.GetWeidth[i], 585);
			  j++;
			  for ( ; j <=17; ) 
				{
					  batch.draw(VetorTextura[j], deck.GetWeidth[i], 25);
					  break;
				}
		}
		batch.end();
		//------------------------------ FIM DA IMPRESSÃO------------------------------------------------------
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
