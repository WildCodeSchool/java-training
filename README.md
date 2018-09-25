# Java Training

Java Traning est une série de quête qui vont te permettre à t'entrainer au développement Java, et où tu auras la possibilité de tester automatiquement ton code.

## Etapes

### Initialisation de ton dépôt

#### 1. Initialiser un nouveau projet

Afin de réaliser l'exercice, fait un *fork* de ce projet sur ton compte *GitHub*, puis *clone* le *fork* sur ton dépôt local.

#### 2. Tu as déjà un *fork*

Si tu as déjà *fork* le dépôt et que tu l'as récupéré en local, tu peux le mettre à jour.

D'abord, si tu ne l'as pas encore fait, relie ton dépôt local *GitHub* d'origine (pas le *fork*) en *upstream* :
```bash
git remote add upstream https://github.com/bastienwcs/java-training
```

Ensuite récupère les modification de l'*upstream* et fusionne-les sur ton dépôt local :
```bash
git fetch upstream
git checkout master
git merge upstream/master
```

> Vérifie que tu as tout bien add/commit/push sur ton dépôt avant de faire ces commandes !

#### Ressources

* [Dépôt Java Training](https://github.com/WildCodeSchool/java-training/)

### Arborescence du projet

Première étape avant de commencer l'exercice : vérifies que tout est bien en place pour travailler.

Si tu fais exécutes la commande "tree" dans ton dépôt, tu devrais avoir l'arborescence suivante :

``` bash
.
├── lib
│   ├── hamcrest-core-1.3.jar
│   └── junit-4.12.jar
├── logs
├── README.md
├── src
│   ├── exercices
│   │   └── Primitives.java
│   └── tests
│       ├── MainTest.java
│       └── PrimitivesTest.java
└── tester.sh

```

Le premier fichier qui va t'intéresser est `tester.sh`. C'est lui qui va se charger de la compilation et de l'exécution des tests.

Pour tester si le script fonctionne, place toi dans le dossier `java-training` et entre la commande :

``` bash
./tester.sh
```
Si tu vois le message :
```bash
bash: ./tester.sh: Permission denied
```
C'est que ton fichier n'a pas les droits d'exécution ! Tu peux modifier ça avec la commande :

```bash
chmod u+x tester.sh 
```

Le message attendu est le suivant :
```bash
Please specify the class to test, e.g. : ./tester.sh Primitives
```

Suivons les indications :
```bash
./tester.sh Primitives
```

Tu vas voir apparaître un tas d'erreurs, c'est normal : ton but est de réparer tout ça !

#### Editer les sources de l'exercice

Chaque exercice va être contenu dans un fichier source, contenu dans le dossier `src/exercices/`.

Commence par éditer le fichier `src/exercices/Primitives.java`.

Dans ce fichier tu vas trouver une série d'action à réaliser. Quand tu penses avoir terminé, lance la commande correspondante :
```bash
./tester.sh Primitives
```

Une série de tests va être exécutée sur ton code, et soit des erreurs seront relevées (et il faudra les corriger en regardant les logs), soit tu auras le super message suivant :
```bash
JUnit version 4.12
.....
Time: 0.004

OK (5 tests)

```


## Challenge

### Envoie ta solution

1. Créé un *fork* du dépôt 
1. Teste ton code avec `./tester.sh Exercice`
2. Quand ton code passe tous les tests, add/commit/push sur ton *fork*
3. Partage ton dépôt *GitHub* en solution de la quête

### Critères de validation

* Le code se compile sans erreur
* Le code passe toutes les validations attendues
* Le code respecte les conventions de code de Java (indentation, nommage de variable, classe, méthodes, etc...)