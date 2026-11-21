package com.example.labactivity31.repository

import com.example.labactivity31.R
import com.example.labactivity31.model.Sport

data class NewsItem(
    val id: String,
    val title: String,
    val category: String,
    val timeAgo: String,
    val content: String
)

object SportsRepository {

    val sportsList = listOf(
        Sport(
            id = "football",
            name = "Football (Soccer)",
            category = "Team Sport",
            iconResId = R.drawable.ic_football,
            shortDescription = "The world's most popular sport played by two teams of 11 players.",
            fullDescription = "Football (Soccer) is a team sport played with a spherical ball between two teams of 11 players. It is played by approximately 250 million players in over 200 countries and dependencies, making it the world's most popular sport. The game is played on a rectangular field called a pitch with a goal at each end.",
            rules = "• 90 minutes played in two 45-minute halves.\n• No hand usage except by the goalkeeper within the penalty box.\n• Offside rule applies to forward passes.\n• Yellow and Red cards for fouls.",
            popularLeagues = "FIFA World Cup, UEFA Champions League, English Premier League, La Liga, Serie A",
            topTeams = "Real Madrid, Manchester City, FC Barcelona, Bayern Munich, Argentina National Team",
            isFavorite = true
        ),
        Sport(
            id = "basketball",
            name = "Basketball",
            category = "Court Sport",
            iconResId = R.drawable.ic_basketball,
            shortDescription = "Fast-paced game where two teams score by shooting a ball through a hoop.",
            fullDescription = "Basketball is a game played between two teams of five players on a rectangular court, usually indoors. Each team tries to score by tossing the ball through the opponent's goal, an elevated horizontal hoop and net called a basket.",
            rules = "• Four 12-minute quarters (NBA) or 10-minute quarters (FIBA).\n• 2 points for regular shots, 3 points from beyond the arc.\n• 24-second shot clock.\n• Maximum 6 personal fouls per player (NBA).",
            popularLeagues = "NBA, EuroLeague, NCAA March Madness, FIBA Basketball World Cup",
            topTeams = "Boston Celtics, Los Angeles Lakers, Golden State Warriors, Real Madrid Baloncesto",
            isFavorite = true
        ),
        Sport(
            id = "tennis",
            name = "Tennis",
            category = "Racket Sport",
            iconResId = R.drawable.ic_tennis,
            shortDescription = "Racket sport played individually against a single opponent or between two teams of two.",
            fullDescription = "Tennis is a racket sport that can be played individually against a single opponent (singles) or between two teams of two players each (doubles). Each player uses a tennis racket that is strung with cord to strike a hollow rubber ball covered with felt over or around a net and into the opponent's court.",
            rules = "• Scoring system: 15, 30, 40, Game.\n• Must win by at least 2 points at Deuce.\n• Sets are won by being first to 6 games with a 2-game margin.\n• Matches are best of 3 or 5 sets.",
            popularLeagues = "Wimbledon, US Open, French Open (Roland Garros), Australian Open",
            topTeams = "Novak Djokovic, Rafael Nadal, Iga Swiatek, Carlos Alcaraz, Jannik Sinner",
            isFavorite = true
        ),
        Sport(
            id = "baseball",
            name = "Baseball",
            category = "Field Sport",
            iconResId = R.drawable.ic_baseball,
            shortDescription = "Bat-and-ball game played between two opposing teams who take turns batting and fielding.",
            fullDescription = "Baseball is a bat-and-ball game played between two opposing teams who take turns batting and fielding. The game proceeds when a player on the fielding team, called the pitcher, throws a ball which a player on the batting team tries to hit with a bat.",
            rules = "• 9 innings per game.\n• 3 outs per half-inning for batting team.\n• 4 balls = walk, 3 strikes = strikeout.\n• Scoring done by runners crossing home plate.",
            popularLeagues = "Major League Baseball (MLB), Nippon Professional Baseball (NPB), KBO League",
            topTeams = "Los Angeles Dodgers, New York Yankees, Houston Astros, Boston Red Sox",
            isFavorite = false
        ),
        Sport(
            id = "volleyball",
            name = "Volleyball",
            category = "Net & Court Sport",
            iconResId = R.drawable.ic_volleyball,
            shortDescription = "Team sport in which two teams of six players are separated by a net.",
            fullDescription = "Volleyball is a team sport in which two teams of six players are separated by a net. Each team tries to score points by grounding a ball on the other team's court under organized rules.",
            rules = "• Played to 25 points (must win by 2), best of 5 sets.\n• Maximum 3 touches per team before sending over the net.\n• Players rotate clockwise when winning a serve back.\n• No player may touch the ball twice consecutively.",
            popularLeagues = "FIVB World Championship, Olympic Volleyball, CEV Champions League",
            topTeams = "Poland National Team, Brazil National Team, Italy National Team, USA Women's Team",
            isFavorite = true
        )
    )

    val newsList = listOf(
        NewsItem(
            id = "n1",
            title = "Champions League Quarter-Final Thrillers Announced",
            category = "Football",
            timeAgo = "2 hours ago",
            content = "The draw for the UEFA Champions League quarter-finals has produced some explosive matchups featuring defending champions and European heavyweights."
        ),
        NewsItem(
            id = "n2",
            title = "NBA Playoff Race Heats Up As Regular Season Nears End",
            category = "Basketball",
            timeAgo = "4 hours ago",
            content = "With only ten games remaining in the regular season, top teams in both Eastern and Western conferences fight for crucial seeding."
        ),
        NewsItem(
            id = "n3",
            title = "Grand Slam Tournament Previews: Favorites & Dark Horses",
            category = "Tennis",
            timeAgo = "1 day ago",
            content = "An in-depth look into court conditions, player fitness, and key rivalries ahead of the upcoming Grand Slam tournament."
        ),
        NewsItem(
            id = "n4",
            title = "World Volleyball Grand Prix Highlights Epic Comeback",
            category = "Volleyball",
            timeAgo = "2 days ago",
            content = "A dramatic five-set thriller concluded yesterday with a spectacular comeback victory in front of a sold-out stadium."
        )
    )

    fun getSportById(id: String): Sport? {
        return sportsList.find { it.id == id }
    }
}
