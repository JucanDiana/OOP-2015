package services.factories;

import com.example.robertvacareanu.zoowsomeandroid1.R;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public final class Constants {

    public static final class Species {
        public static final String Mammals = "Mammals";
        public static final String Reptiles = "Reptiles";
        public static final String Birds = "Birds";
        public static final String Aquatics = "Aquatics";
        public static final String Insects = "Insects";
        public static final String Random = "Random";
    }

    public static final class Animals {
        public static final class Mammals {
            public static final String Tiger = "TIGER";
            public static final String Monkey = "MONKEY";
            public static final String Cow = "COW";
        }

        public static final class Reptiles {
            public static final String Lizard = "LIZARD";
            public static final String Snake = "SNAKE";
            public static final String Crocodile = "CROCODILE";
        }

        public static final class Birds {
            public static final String Owl = "OWL";
            public static final String Nightjar = "NIGHTJAR";
            public static final String Woodpecker = "WOODPECKER";
        }

        public static final class Aquatics {
            public static final String Shark = "SHARK";
            public static final String Whale = "WHALE";
            public static final String Goldfish = "GOLDFISH";
        }

        public static final class Insects {
            public static final String Butterfly = "BUTTERFLY";
            public static final String Spider = "SPIDER";
            public static final String Cockroach = "COCKROACH";
        }
    }

    public static final class Employees {
        public static final String Employee = "Employee";
        public static final String Caretaker = "Caretaker";

        public static final class Caretakers {
            public static final String TCO_SUCCESS = "SUCCESS";
            public static final String TCO_KILLED = "KILLED";
            public static final String TCO_NO_TIME = "NO_TIME";
        }
    }

    public static final class XML_TAGS {
        public static final String DISCRIMINANT = "DISCRIMINANT";
        public static final String ANIMAL = "ANIMAL";
        public static final String EMPLOYEE = "EMPLOYEE";
        public static final String CARETAKER = "CARETAKER";
    }

    public static final class FRAMES {
        public static final int HEIGHT = 500;
        public static final int WIDTH = 700;
    }

    public static final class PATHS {
        public static final String animalPath = "javasmmr.zoowsome.models.animals.";
        public static final String employeePath = "javasmmr.zoowsome.models.employees.";
    }
    public static final class EntityImageLinker {
        public static final ImmutableMap<String, Integer> entityImageLinker = new ImmutableMap.Builder<String, Integer>()
                .put("Butterfly", R.drawable.butterfly)
                .put("Cockroach", R.drawable.cockroach)
                .put("Cow", R.drawable.cow)
                .put("Crocodile", R.drawable.crocodile)
                .put("Goldfish", R.drawable.goldfish)
                .put("Lizard", R.drawable.lizard)
                .put("Monkey", R.drawable.monkey)
                .put("Nightjar", R.drawable.nightjar)
                .put("Owl", R.drawable.owl)
                .put("Shark", R.drawable.shark)
                .put("Snake", R.drawable.snake)
                .put("Spider", R.drawable.spider)
                .put("Tiger", R.drawable.tiger)
                .put("Whale", R.drawable.whale)
                .put("Woodpecker", R.drawable.woodpecker)
                .build();
    }
}
