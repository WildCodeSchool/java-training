## Java Training

### 1. Git

#### a. En cours de nouveau projet

Afin de réaliser l'exercice, fait un *fork* de ce projet sur ton compte *GitHub*, puis *clone* le *fork* sur ton dépôt local.

#### b. Tu as déjà un *fork*

Si tu as déjà *forké* le dépôt et que tu l'as récupéré en local, tu peux le mettre à jour de la façon suivante :

```bash
git fetch upstream
git checkout master
git merge upstream/master
```

> Vérifie que tu as tout bien add/commit/push avant de faire ces commandes !

### 2. Arborescence et tester.sh

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

### 3. Les sources

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

### 4. Résultat

Quand ton code passe tous les tests, add/commit/push et partage ton dépôt *GitHub* en solution de la quête !