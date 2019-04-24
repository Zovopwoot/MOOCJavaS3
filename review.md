## Problèmes
- Tu n'as pas fais attention à la visibilité de tes variables, elle sont toutes public (par défaut) elle devraient être private.
C'est le principe t'encapsulation, c'est là dessus que repose le programmation orienté object, et c'est aussi grâce à ça que tu peux créer des programmes robustes.
Si tu te disais que c'etait pas grave, ben en fait si!
- Ton project n'a pas la structure standard, de ce fait Intelij ne peux pas t'aider et aussi ça fait galerer tout le monde (enfin moi et tes futurs collegues :p)
- tu as de la logiques inutiles par exemple

```java
            if (pointJ1 == 0 || pointJ1 < 3) {// augmentation d'un point
                pointJ1++;
            } else if (pointJ1 >= 3 && pointJ2 >= 3 && pointJ1 == pointJ2)
```
ici `pointJ1 >= 3` est inutile regarde bien ton code.

- des variables utilisé  mais non initialisé (joueur1 et joueur2) (c'est de la que viennent tes NullPointer)
- le methode toSting contient de la logique. c'est tres mauvais et tres grave. toString est une methode d'affichage, elle doit donc faire que de l'affichage!!!! (demande moi si tu vois pas comment faire)
#Amélio
- Encore de l'anglais et du fr
- (Relis plusieurs fois pour bien comprendre ce qui suit ->) La méthode `toString()` est une methode de la classe `Object`. en Java toutes les classes que tu créees héritent de la classe object
(ta classe MatchTennis est une classe enfant de la classe Object qui est donc sa classe mère). Ce qui veux dire que par défaut ta classe `MatchTennis` possède déjà la methode `toString`.
Ce que je veux te dire là c'est que en créant la méthode toString() dans ta classe `MatchTennis` tu l'as en fait `override` = Tu as modifié le comportement par défaut de cette methode.
Quand tu dais ce genre de chose tu dois ajouter l'annotation `@override` au dessus de ta methode.

# A FAIRE
- Pour le projet suivant creer un project avec la bonne structure (demande moi)
- tout en anglais!
- On respecte l'encapsulation!!!
- On enleve la logique de la methode toString!!

# OBS
c'est bien plus lisible ;)
