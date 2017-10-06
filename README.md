# Morpion

Le but de ce kata est d’analyser une grille de morpion en 3x3, et de retourner le vainqueur :

* 'x' si x gagne
* 'o' si o gagne
* '.' en cas d'égalité

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar TicTacToeTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TicTacToeTest
