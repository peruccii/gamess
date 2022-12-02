package br.senai.sp.jandira.games.dao

import android.content.Context
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.model.Games

class GamesDao {
    companion object{
        fun getGames(context: Context): List<Games>{
            val game = Games()
            game.code = 1
            game.gameName ="Valorant"
            game.companyName ="Riot"
            game.descriptionGame ="O título conta com um elenco de personagens com habilidades específicas e mapas onde o objetivo é ativar um bomba ou defender um território. Os times começam a partida como ataque ou defesa, e trocam de lado na décima segunda rodada. Vence a equipe que fizer 13 pontos primeiro, e os jogos têm até 24 rounds."
            game.image = context.getDrawable(R.drawable.valorant)

            val game2 = Games()
            game2.code = 2
            game2.gameName ="FIFA 23"
            game2.companyName ="EA SPORTS"
            game2.descriptionGame ="FIFA 23 é um jogo eletrônico de simulação de futebol desenvolvido pela Electronic Arts. O jogo é o último a utilizar a marca FIFA no nome e foi lançado dia 30 de setembro de 2022, para Xbox Series S/X, Xbox One, PlayStation 5, PlayStation 4 e Microsoft Windows."
            game2.image = context.getDrawable(R.drawable.fifa)

            val game3 = Games()
            game3.code = 3
            game3.gameName ="Horizon"
            game3.companyName ="Guerrilla Games"
            game3.descriptionGame ="Segue a trama de Aloy, uma caçadora em um mundo invadido por máquinas, que decide descobrir seu passado, explorando o mundo para descobrir locais e realizar missões secundárias. Horizon Zero Dawn é a primeira propriedade intelectual da Guerrilla Games desde Killzone, de 2004, e seu primeiro jogo de RPG."
            game3.image = context.getDrawable(R.drawable.horizon)

            val game4 = Games()
            game4.code = 4
            game4.gameName ="The Last of Us Part II"
            game4.companyName ="Sony"
            game4.descriptionGame ="The Last of Us Part II é um jogo eletrônico de ação-aventura desenvolvido pela Naughty Dog e publicado pela Sony Interactive Entertainment. É o segundo jogo da franquia e foi lançado em 19 de junho de 2020 exclusivamente para PlayStation 4."
            game4.image = context.getDrawable(R.drawable.last)

            val game5 = Games()
            game5.code = 5
            game5.gameName ="Forza Horizon 5"
            game5.companyName ="Playground Games"
            game5.descriptionGame ="Forza Horizon 5 é um jogo eletrônico de corrida desenvolvido pela Playground Games e publicado pela Xbox Game Studios. É o quinto jogo da série Forza Horizon e o décimo segundo título principal da franquia Forza. O jogo se passa em uma representação ficcional do México"
            game5.image = context.getDrawable(R.drawable.forza)

            val game6 = Games()
            game6.code = 6
            game6.gameName ="Dead by Daylight "
            game6.companyName ="Behaviour Interactive."
            game6.descriptionGame ="Dead by Daylight é um jogo eletrônico multijogador online assimétrico de survival horror desenvolvido pela Behaviour Interactive.."
            game6.image = context.getDrawable(R.drawable.dead)

            val games = listOf<Games>(game, game2, game3, game4, game5, game6)
            return games
        }
    }
}