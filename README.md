# Projet Java : Pointeuse

## Sujet propos� et encadr� par Monsieur Carl Esswein - Polytech Tours

### �tudiants :  
- **Theo BOISSEAU (theo.boisseau@etu.univ-tours.fr)**
- **Sarah DENIS (sarah.denis-2@etu.univ-tours.fr)**  
- **Mohammed RMICH (mohammed.rmich@etu.univ-tours.fr)**  
- **Chadi YASSIN (chadi.yassin@etu.univ-tours.fr)**

#### Application
L'application d�velopp�e permet de g�rer les pointages (arriv�es et d�parts) des employ�s d'une entreprise donn�e.  

Les sources relatives au deux programmes demand�s ont �t� cod�es dans un seul
projet *Eclipse*, les classes sont ainsi selon des packages de **l'application principale** et de **l'�mulateur**.
Cependant, nous avons utilis� le mod�le **MVC** afin de mieux structurer notre projet et lui donner 
une meilleur lisibilit�. Nous avons r�parti l'ensemble de nos classes dans des packages **model**, **view**, et **controller**
qui sont propres � chacun des deux programmes (application principale, �mulateur).  
En plus de ces packages, nous avons cr�� d'autres dont les classes sont partag�es entre **l'application principale** et **l'�mulateur**,
en particulier les classes qui permettent de s'occuper de la communication **TCP** et de la gestion de l'historique
des pointages.
Nous avons �galement suivi une conception qui respecte les proc�dures du *g�nie logiciel*,
dans le but de rendre l'entretien de notre code plus facile.  
Au niveau de l'emplacement des m�thodes main, celle de l'application principale se trouve dans le package **controller.mainapp** et dans la classe **Mainapp**.Celle de l'�mulateur a �t� plac�e dans le package **controller.emulator**, dans la classe **Emulator**. Les fichiers de sauvegarde des donn�es s�rialis�es
de l'application principale (respectivement l'�mulateur) se trouve dans le dossier **backupMainapp** (respectivement **backupEmulator**).
Pour effectuer une sauvegarde, il suffit de fermer les fen�tres principales de l'�mulateur, ensuite de l'application principale. Les sauvegardes se feront tout de m�me � des intervalles r�guliers.   

Afin que l'�mulateur puisse communiquer avec l'application principale, celle-ci doit �tre allum�e. Une fois la connexion �tablie,
l'�mulateur re�oit les derni�res mises � jour des listes des employ�es inscrits dans le syst�me, ce qui lui permettra
de valider ou non un identifiant, lors d'un pointage.