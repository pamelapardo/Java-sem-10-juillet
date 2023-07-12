# MARDI - JAVA - CONTINUATION

# Termes

**.mot** = méthode de classe.

**Mot** = (qui commence par majuscule) est une classe, un objet.

**`main`** = c’est la classe principal qui execute l’application.

******`new`** = Crée une instance basé dans les paramètres d’une classe. 

# Chaine de caractères

Les chaines de caractères sont des objets java, elles sont donc soumises au règles de la programmation orientée objet.

```java
String chaine = "une chaine de caracteres";
```

![En memoire voici ce que ca donne.](MARDI%20-%20JAVA%20-%20CONTINUATION%2091d5d6e1c5f0435fb9dc4f5098008dfd/image-8.png)

En memoire voici ce que ca donne.

En general on a tendance a considerer les String comme des types primitifs, mais ce n'est pas le cas. En realité, lorsqu'on cree une string on cree une instance de la classe `String` qui contient un tableau de char.

```java
String chaine = new String("une chaine de caracteres");
```

Apres sa création une chaine de caractères ne peut plus être modifiée. On dit qu'elle est `immutable`.

```java
\* cette instruction ne compile pas *\
chaine = chaine + " et une autre chaine";
```

La classe String nous met a disposition de nombreux outils pour manipuler les chaines de caractères.

```java
String chaine = "une chaine de caracteres";
chaine.length(); // retourne la taille de la chaine
chaine.charAt(0); // retourne le caractere a l'index 0
chaine.substring(0, 4); // retourne la sous chaine de caracteres de l'index 0 a 4
chaine.indexOf("chaine"); // retourne l'index de la premiere occurence de "chaine"
chaine.replace("chaine", "string"); // remplace la premiere occurence de "chaine" par "string"
chaine.toUpperCase(); // retourne la chaine en majuscule
chaine.toLowerCase(); // retourne la chaine en minuscule
chaine.trim(); // supprime les espaces en debut et fin de chaine
chaine.split(" "); // retourne un tableau de String en decoupant la chaine a chaque espace
chaine.equals("une chaine de caracteres"); // retourne true si les deux chaines sont identiques
chaine.equalsIgnoreCase("UNE CHAINE DE CARACTERES"); // retourne true si les deux chaines sont identiques en ignorant la casse
chaine.startsWith("une"); // retourne true si la chaine commence par "une"
chaine.endsWith("res"); // retourne true si la chaine se termine par "res"
```

### Comparer les chaines de caractères

En java il est **impossible** de comparer deux chaines de caractères avec l'opérateur `==`:

```java
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1 == chaine2; // retourne false
```

Pour comparer deux chaines de caractères il faut utiliser la méthode `equals`:

```java
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1.equals(chaine2); // retourne true
```

Cette fonction compare les chaines de caractères, caractère par caractère.

La méthode format permet de formater une chaine de caractères en utilisant des marqueurs de position:

```java
boolen estVrai = true;
int entier = 10;
double decimal = 10.5;
String chaine = "une chaine de caracteres";
System.out.println(String.format("un booleen : %b, un entier : %d, un decimal : %f, une chaine : %s",) estVrai, entier, decimal, chaine);
```

Ou encore:

```java
boolean b=true;
String s="chaine";
int i=56;
double d=5.5;
System.out.println(String.format("boolean : %b %n" +
                 "chaine de caractères : %s %n" +
                 "entier : %d %n" +
                 "entier en hexadécimal : %x %n" +
                 "entier en octal : %o %n" +
                 "décimal : %f %n" +
                 "décimal précis au dixième : %.1f %n" +
                 "décimal au format scientifique : %e %n",
                 b,s,i,i,i,d,d,d));
```

# Les conversions

En java il existe deux types de conversions :

- les conversions implicites
- les conversions explicites

### Les conversions implicites

Les conversions implicites sont des conversions qui sont faites automatiquement par le compilateur.

```java
int entier = 10;
double decimal = entier; // conversion implicite
```

### Les conversions explicites

Les conversions explicites sont des conversions qui sont faites par le programmeur.

```java
double decimal = 10.5;
int entier = (int) decimal; // conversion explicite
```

La conversion entre types numériques est possible si le type de destination est plus grand que le type source.

```java
int entier = 10;
double decimal = entier; // conversion implicite
```

La conversion vers des chaines de caractères est possible pour tous les types.

```java
int entier = 10;
String chaine = String.valueOf(entier); // conversion explicite
```

Dans certains cas il n'y a pas besoin d'utiliser une méthode pour convertir un type en chaine de caractères.

```java
int entier = 10;
String chaine = "" + entier; // conversion implicite
```

La conversion depuis une chaine de caractères: la classe Integer

La classe Integer permet de convertir une chaine de caractères en un entier.

```java
String chaine = "10";
int entier = Integer.parseInt(chaine); // conversion explicite
```

L'inférence de type

Depuis Java 10, il est possible de déclarer une variable sans préciser son type. Le compilateur va alors inférer le type de la variable en fonction de la valeur qui lui est affectée.

```java
var entier = 10;
var decimal = 10.5;
var chaine = "une chaine de caracteres";
```

---

# TP

Correction du TP d’hier par le prof:

```java
public class TpMain{	 

     static String[] adresses; 
     static String[] listeBruteFournisseurs; 
     static String[] listeFournisseursDistincts; 
     static int[] nombreClients;
     
     public static void main(String[] args) 
     { 
          //INITIALISATION DU TABLEAU
         adresses=new String[10];
         adresses[0]="jpp@sfr.fr";
         adresses[1]="tom@gmail.com";
         adresses[2]="fred@sfr.fr";
         adresses[3]="victor@sfr.fr"; 
         adresses[4]="chris@sfr.fr"; 
         adresses[5]="robert@orange.fr"; 
         adresses[6]="paul@sfr.fr"; 
         adresses[7]="lise@gmail.com"; 
         adresses[8]="thierry@isitech.fr"; 
         adresses[9]="marie@isitech.fr"; 
         
         //RECUPERATION DES FOURNISSEURS DE CHAQUE ADRESSE
         listeBruteFournisseurs =new String[10]; 
         for (int i=0;i<adresses.length;i++) 
         { 
        	 //Pour chaque adresse, récupération de la chaine après le @:
             listeBruteFournisseurs[i]=adresses[i].substring(adresses[i].indexOf('@')+1); 
         } 
         System.out.println("Liste brute des fournisseurs:");
         System.out.println(Arrays.toString(listeBruteFournisseurs));
         
         //RECUPERATION DE LA LISTE DES FOURNISSEURS DISTINCTS ET NOMBRE CLIENTS
         //1-Trier le tableau
         Arrays.sort(listeBruteFournisseurs);
         System.out.println("Liste triée des fournisseurs:");
         System.out.println(Arrays.toString(listeBruteFournisseurs));
         //2-Initialiser le tableau des fournisseurs distincts avec une taille de 1 (car il y a au moins 1 fournisseur)
         //et initialiser le tableau du nombre de clients par fournisseurs
         listeFournisseursDistincts = new String[1];
         nombreClients = new int[1];
         //3-Ajouter le premier fournisseur et lui associer 1 client:
         listeFournisseursDistincts[0]=listeBruteFournisseurs[0];
         nombreClients[0]=1;
         //4-Parcourir le tableau trié des fournisseurs pour détecter d'éventuels autres fournisseurs
         //Le parcours commence à l'index 1 car celui de l'index 0 a été ajouté à la liste des fournisseurs distincts
         for(int i=1;i<listeBruteFournisseurs.length;i++)
         {
        	 //5-Si le fournisseur actuel est différent du dernier fournisseur distinct ajouté
        	 //C'est que c'est un nouveau fournisseur.
        	 if(!listeBruteFournisseurs[i].equals(listeFournisseursDistincts[listeFournisseursDistincts.length-1]))
        	 {
        		//Agrandir le tableau des fournisseurs distincts d'une case
        		//et agrandir le tableau du nompbre de clients d'une case
        		listeFournisseursDistincts = Arrays.copyOf(listeFournisseursDistincts, listeFournisseursDistincts.length+1);
        		nombreClients = Arrays.copyOf(nombreClients, nombreClients.length+1);
        		//Ajouter ce nouveau fournisseur dans le tableau et lui associer 1 client
        		listeFournisseursDistincts[listeFournisseursDistincts.length-1]=listeBruteFournisseurs[i];
        		nombreClients[nombreClients.length-1]=1;
        	 }
        	 else
        	 {
        		 //C'est un fournisseur déjà référencé, il suffit d'ajouter un client
        		 nombreClients[nombreClients.length-1]+=1;
        	 }
         }
         System.out.println("Liste des fournisseurs distincts:");
         System.out.println(Arrays.toString(listeFournisseursDistincts));
         System.out.println("Nombre de clients pour chaque fournisseurs");
         System.out.println(Arrays.toString(nombreClients));
         
         //AFFICHAGE DE LA PART DE MARCHE DE CHACUN DES FOURNISSEURS:
         System.out.println("Parts de marché:");
         for(int i=0;i<listeFournisseursDistincts.length;i++)
         {
        	 System.out.println(String.format("=> %s \t: %d clients sur %d (%.1f%%)"
        			 											, listeFournisseursDistincts[i]
        			 											, nombreClients[i]
        			 											, adresses.length,
        			 											(nombreClients[i]*100.0/adresses.length)));
         }
         
     } 
 }
```

Solution de Julien:

```java
public class Main {
	public static void main(String[] args) {
	String[] emails = {
		"jpp@sfr.fr",
		"tom@gmail.com",
		"fred@sfr.fr",
		"victor@sfr.fr",
		"chris@sfr.fr",
		"robert@orange.fr",
		"paul@sfr.fr",
		"lise@gmail.com",
		"thierry@gmail.com",
		"marie@isitech.fr",
		"marie@isitech.fr"
	};
	
	int totalEmails = emails.length;
	int gmailCount = 0; //total des comptes gmail
	int sfrCount = 0;
	int orangeCount = 0;
	int isitechCount = 0;
	
	for (String email : emails) {
	if (email.endsWith("@gmail.com")) { // Utilisation de endsWith(String suffix) pour trouver le fournisseur de mail
			gmailCount++;
		} else if (email.endsWith("@sfr.fr")) {
			sfrCount++;
		} else if (email.endsWith("@orange.fr")) {
			orangeCount++;
		} else if (email.endsWith("@isitech.fr")) {
			isitechCount++;
		}
	}
	
	//On fait le pourcentage en fonction de tous les mails.
	double gmailPercentage = (double) gmailCount / totalEmails * 100; //(double) force le resutat de la div à être en double
	double sfrPercentage = (double) sfrCount / totalEmails * 100;
	double orangePercentage = (double) orangeCount / totalEmails * 100;
	double isitechPercentage = (double) isitechCount / totalEmails * 100;
	
	System.out.println("Pourcentage de fournisseur de service mail :");
	System.out.println("Gmail : " + gmailPercentage + "%"); //Pour afficher les diff chose mettre des "+"
	System.out.println("SFR : " + sfrPercentage + "%");
	System.out.println("Orange : " + orangePercentage + "%");
	System.out.println("Isitech : " + isitechPercentage + "%");
	}
}
```

Pour aller plus loin:

- Placer le code dans une fonction.
- Elle doit prendre en paramètres un tableau de string qui contient des adresses mail.
- La fonction ne doit pas avoir connaissances du nom des fournisseurs.
- Elle doit toujours afficher le pourcentage de fournisseurs de services mail, quel que soit le nombre de fournisseurs.

# TP2

Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à ce que vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais nécessaires pour obtenir cette combinaison.

Solution

```java
package numAleatoire;
import java.util.Random;

public class NombreAleatoire {

	public static void main(String[] args) {
		// On defini la premiere boucle
		int attemps = 0;
		Random random = new Random();  
		int num1 , num2, num3;

		
		 while (true) {
			 num1= random.nextInt(1001);
			 num2 = random.nextInt(1001);
			 num3 = random.nextInt(1001);
			 attemps += 1;
		  if (num1 % 2 == 0 && num2 % 2 == 0 && num3 != 0) {
			 System.out.println("Premier nombre pair: " + num1);
			 System.out.println("Deuxieme nombre chiffre pair: " + num2);
			 System.out.println("Premier nombre impair: " + num3);
			 break;
		  }
			  
		 }
		 
		 System.out.println("N. de boucles pour trouver le resul: " + attemps);
		 
	}

}
```

# TP3

Créer un juste prix en console avec un affichage du temps et du nombre de tentatives mises par l'utilisateur pour trouver le juste prix.

Solution par Julien (pour ma comprehension):

```java
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int justePrix = rand.nextInt(100) + 1; //random entre 1 et 100
		int tentative = 0; //nombre de tentatives
		int proposition; //proposition que va soumettre le joueur
		
		Scanner scanner = new Scanner(System.in); //crée une nouvelle instance de la classe Scanner.
		long debut = System.currentTimeMillis(); //debut du chronometre, long date en miliseconde depuis le 1 janvier 1970
		
		System.out.println("Bienvenue dans le jeu du Juste Prix ! Trouvez le nombre mystère entre 1 et 100.");
		
		do {
			System.out.print("Entrez votre proposition : ");
			proposition = scanner.nextInt(); //nombre entrer par le joueur, lecture de ce nombre par le "scanner"
			tentative++;
			
			if (proposition < justePrix) {
				System.out.println("C'est plus !");
			} else if (proposition > justePrix) {
				System.out.println("C'est moins !");
			} else {
				System.out.println("Félicitations ! Vous avez trouvé le juste prix en " + tentative + " tentative(s).");
			}
		} while (proposition != justePrix);
		
		long fin = System.currentTimeMillis(); //arret du chronomettre
		long tempsJeu = (fin - debut) / 1000; //temps du jeu en secondes
		System.out.println("Temps de jeu : " + tempsJeu + " secondes.");
		
		scanner.close(); //fermeture du scanner
	}
}
```

# TP4

Ecrire un programme qui demande à l’utilisateur de saisir un nombre entier et qui affiche sa valeur en binaire, octale et hexadécimale.

Solution:

```java
package tpquatre;
import java.util.Scanner;

public class tp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Write a mother fucking number");
		
		int test = input.nextInt();
		
		String binary = Integer.toBinaryString(test);
		String octal = Integer.toOctalString(test);
		String hex = Integer.toHexString(test);
		System.out.println("This is the mf binary: " + binary);
		System.out.println("This is the mf octal: " + octal);
		System.out.println("This is the mf hex: " + hex);
		
	}

}
```

# TP5

Créer une classe représentant un article d’un magasin de vente par en ligne. Un article est caractérisé par sa référence, sa désignation, son prix. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

Solution:

```java

```

# TP6

Créer une classe représentant un client d’un magasin de vente par en ligne. Un client est caractérisé par son nom, son prénom, son adresse, son code postal et sa ville. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

```java

```

# TP7

Créer une classe représentant une commande d’un magasin de vente par en ligne. Une commande est caractérisée par son numéro, sa date, le client qui passe la commande, le tableau des articles commandés et le tableau des quantités commandées pour chaque article. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

```java

```