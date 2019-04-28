SCORE DE TENNIS
Un match de tennis oppose deux joueurs. C'est une succession de points joués, chaque point étant gagné par l'un des deux joueurs. Lorsqu'un joueur a remporté au moins 4 points et qu'il en a 2 de plus que son adversaire il marque un jeu et le score des points est remis à zéro et un autre jeu commence.

Le premier joueur qui a remporté au moins 6 jeux et en a 2 de plus que son adversaire remporte une manche (appelée aussi set) et le score des jeux est remis à zéro pour une nouvelle manche.

Les matchs de tennis peuvent se dérouler en plusieurs manches, mais dans la version normale de ce test hebdomadaire, le match ne comportera qu'une manche.

Par ailleurs, pour annoncer les scores, il y a un décompte un peu particulier : un joueur qui n'a gagné aucun point aura un score de 0, s'il a gagné un point, son score est de 15, deux points, score de 30, trois points, score de 40. Au-delà, on n'annonce plus un score mais la différence avec l'adversaire. Si les deux joueurs ont gagné le même nombre de points et plus de 3, le score annoncé est égalité. Sinon il est annoncé un avantage pour le joueur qui a un point de plus que l'autre (sil en avait deux de plus, le jeu serait fini et le décompte des points remis à zéro). Donc l'annonce de score dans le cas d'un point de plus est avantage untel.

Les annonces de score possibles pour un jeu dans un match entre Émile Zola et Victor Hugo sont : 0-0, 15-0, 0-15, 15-15, 0-30, 30-0, 15-30, 30-15, 30-30, 0-40, 40-0, 15-40, 40-15, 30-40, 40-30, 40-40, avantage Zola, avantage Hugo, égalité.

Pour les jeux, c'est plus simple, chaque jeu gagné est comptabilisé au moyen d'une unité. Par exemple un score de 4-3 signifie que Zola a gagné 4 jeux et Hugo 3.

A la fin d'un match en une manche, le score est juste un nombre de jeux pour chaque joueur. Par exemple 6-4 ou 7-5 ou 8-10. En cours de match, c'est un nombre de jeux suivi du nombre de points de chaque joueur avec la comptabilité étrange du tennis, par exemple 2-3 40-15 (2 jeux à 3 et 40-15 dans le jeu en cours).

PROGRAMME
Créez une classe permettant de représenter un score de tennis. A la création de l'objet, le score est vierge (0 jeux à 0 et 0 points à 0). Deux méthodes différentes permettent d'enregistrer le gain d'un point, l'une par le premier joueur, l'autre par le second. Deux autres méthodes représentent l'abandon, l'une du premier joueur, l'autre du second joueur. La méthode toString renvoie une chaîne de caractères contenant le score courant.

Le programme ne comportera que les 5 méthodes décrites: deux pour les points, deux pour l'abandon et toString. Contrairement à l'exemple des scores de football, la classe n'aura pas de méthode pour déclarer que le match commence. Le choix du nom des méthodes est libre sauf toString. Une fois le match terminé, le score ne doit plus changer.

Version simplifiée (50% des points) : le match ne comporte qu'un seul jeu. Le score est seulement celui du jeu courant.
Version normale : celle expliquée ci-dessus.
Version améliorée 1 : la règle du tie-break s'applique en cas d'égalité 6 jeux à 6. Cette règle n'est pas expliquée dans cet énoncé : à vous de la trouver.
Version améliorée 2 : la règle du tie-break s'applique en cas d'égalité 6 jeux à 6 et le match comporte plusieurs manches : pour gagner le match, un joueur doit avoir gagné deux manches.
CONTRAINTES POUR LE CORRECTEUR
La classe que vous écrirez ne contiendra pas le nom des joueurs. Pour les avantages et abandons, il seront désignés respectivement par joueur 1 et joueur 2. L'abandon d'un joueur doit être signifié dans la chaîne renvoyée par toString avec le mot abandon écrit en toutes lettres.
