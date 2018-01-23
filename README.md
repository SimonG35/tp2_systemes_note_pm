# Compte rendu TP 2 de Systèmes

### Licence Professionnelle Programmation Mobile

Simon Grondin
[Lien vers le sujet de TP (réseau IUT)](http://hina/~sesalva/systeme/tp2/)

## 1- Simulation d'une patisserie

### A)

    Ici, le patron des lecteurs/rédacteurs n'est pas approprié, car toute écriture exclut toute lecture. Cela impliquerait, dans le cadre d'une patisserie, que les clients ne peuvent rien acheter tant que le patissier n'a pas fini de confectionner ce qu'il souhaite vendre. Ce qui est impensable, car on souhaite toujours des gâteaux les plus frais possibles.

### B)

    La classe Patisserie incarne le moniteur ici, car elle contient l'état partagé des threads, la liste des gâteaux consommables. La responsabilité est légèrement étendue à la classe Patissier qui gère son propre wait de production. Les instrucitons ait permettent de gérer l'exclusion mutuelle : le wait de production, attend avant de produire dans le cas ou la liste est pleine,tandis que celui de consommation attend qu'au moins un élément soit sur la liste avnt de le consommer.
    Les threads sont lancés en en construisant avec des objets **Runnable** (Patissier et Client), puis en appelant leur méthode Start.


## 2- Simulation d'une patisserie avec collection ThreadSafe

    L'exclusion mutuelle est gérée par l'ArrayBlockingQueue elle-même, et fait donc office de moniteur.


## 3- Fin de programme

## A)

    Cette solution était déjà implémentée avec l'ArrayList. Ici, même lorsque les clients ont consommé jusqu'à leur limite, les producteurs produiront jusqu'à remplir la file d'attente. Cela pourrait, dans certains cas, saturer la mémoire.

## C)

    L'inconvénient de cette solution, est qu'il se complexifie dans certaines configurations. Celles à plusieurs clients deviennent autrement plus compliquées pour être sûr que chacun, tandis que celles à plusieurs producteurs deviennent de véritables puzzles, lorsque les consommateurs ont inférieurs en nombre.


