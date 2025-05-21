# Design Pattern : Singleton

## Qu'es-ce que le Singleton ?

Imaginer que vosu avez une recette secrète. Vous ne noulez pas que tout le monde puisse la modifier ou en créer une nouvelle version. Vous voulez qu'il n'y ait qu'une seule copie de cette recette, et que tout le monde utilise cette copie unique.
Le **design pattern Singleton**, c'est un peu comme ça. Il s'assure qu'une classe n'a qu'une seule instance et fournit un moyen global d'y accéder. C'est utile lorsque vous voulez qu'une seule instance d'une classe coordonne des actions à travers un système.

## Pourquoi utiliser le Singleton ?

1. **Contrôle d'accès :**
- Vous voulez contrôler l'accès à une ressource partagée, comme une base de données ou un fichier de configuration.
2. **Economie de ressources :**
- Vous ne voulez pas créer plusieurs instances d'une classe qui consomme beaucoup de ressources.
3. **Point d'accès global :**
- Vous voulez fournir un point d'accès global à une instance unique.

## Comment ça marche ?

Se référer à l'exercice opéré.

## Avantages et invconvénients

### Avantages :

- **Contrôle d'accès :** contrôle total sur l'instanciation de la classe.
- **Economie de ressources :** évite la création de plusieurs instances inutiles.
- **Point d'accès global :** point d'accès unique et global à l'instance.

### Inconvénients :

 - **Complexité :** peut introduire de la complexité dans le code, surtout si mal utilisé.
 - **Prblèmes de test :** peut rendre les test unitaires plus difficiles, car il introduit un état global.
 - **Problèmes de concurrence :** dans un environnemnt multithread, vous devez vous assurer que l'instanciation est thread-safe.

## Exemple

Imaginez un système de gestion de bas de données. Vous ne voulez pas que plusieurs connexions à la base de données soient créées inutilement. Vous voulez qu'il n'y ait qu'une seule connexion, et que tout le monde utilise cette connexion unique. Le Singleton est parfait pour cela.

## Conclusion

Le **design pattern Singleton** est un outil puissant pour s'assurer qu'une classe n'a qu'une seule instance et fournir un point d'accès global à cette instance. Il est utile dans de nombreuses situations, mais il doit être utilisé avec précaution pour éviter les pièges potentiels.