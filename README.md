# SRP
## Single Responsibility Principle (SRP)
Le principe de responsabilité unique stipule qu'une classe ne doit faire qu'une seule chose et qu'elle ne doit donc avoir qu'une seule raison de changer .
Pour savoir si une classe respecte le SRP, il faut dire: « La classe X fait … » en étant le plus spécifique possible.
### Exemple
Nous examinerons le code d'un simple programme de facturation de librairie à titre d'exemple. Commençons par définir une classe de livre à utiliser dans notre facture.
notre programme ce compose de deux class principale : 
Book : represent le modele d'un livre 
Invoice : represent la class de facture pour un livre donnez et il contient troix methodes principale
* La méthode calculateTotal , qui calcule le prix total.
* La méthode printInvoice , qui devrait imprimer la facture sur la console.
* La méthode saveToFile , responsable de l'écriture de la facture dans un fichier.
#### Probleme
La première violation est la méthode printInvoice , qui contient notre logique d'impression. Le SRP stipule que notre classe ne devrait avoir qu'une seule raison de changer, et cette raison devrait être un changement dans le calcul de la facture pour notre classe.<br>

Mais dans cette architecture, si on voulait changer de format d'impression, il faudrait changer de classe. C'est pourquoi nous ne devrions pas mélanger la logique d'impression avec la logique métier dans la même classe.<br>

Il existe une autre méthode qui viole le SRP dans notre classe : la méthode saveToFile . C'est aussi une erreur extrêmement courante de mélanger la logique de persistance avec la logique métier.<br>
#### Solution
Notre solution consiste à créer deux nouvelles classes, chacune d'entre elles étant responsable d'une
d'une seule fonction bien précise
* La classe InvoicePrinter : responsable de l'impression (affichage) de la facture
* La seconde classe InvocePersistence : responsable de la sauvegarde de la facture dans un fichier.