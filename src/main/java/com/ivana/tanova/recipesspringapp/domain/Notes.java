package com.ivana.tanova.recipesspringapp.domain;

import lombok.*;

import javax.persistence.*;

// This is project Lambok annotation that generates getters and setters and constructor
// equals and hash string. You can unlambock this file to see what is generated
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob // This annotates DB to store it as BLOB object
    private String recipeNotes;
    @OneToOne //every recipe has one note
    private Recipe recipe;
}

// This is what Lamboc generates as code:


//@Entity
//public class Notes {
//    @Id
//    @GeneratedValue(strategy = GenerationType.ID
//            private Long id;
//            @Lob
//            private String recipeNotes;
//            @OneToOne
//            private Recipe recipe;
//            public Notes() {
//            }
//            public Long getId() {
//            return this.id;
//            }
//            public String getRecipeNotes() {
//            return this.recipeNotes;
//            }
//            public Recipe getRecipe() {
//            return this.recipe;
//            }
//            public void setId(Long id) {
//        this.id = id;
//    }
//    public void setRecipeNotes(String recipeNote
//        this.recipeNotes = recipeNotes;
//}
//    public void setRecipe(Recipe recipe) {
//        this.recipe = recipe;
//    }
//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Notes)) return false;
//        final Notes other = (Notes) o;
//        if (!other.canEqual((Object) this)) retu
//        final Object this$id = this.getId();
//        final Object other$id = other.getId();
//        if (this$id == null ? other$id != null :
//        final Object this$recipeNotes = this.get
//        final Object other$recipeNotes = other.g
//        if (this$recipeNotes == null ? other$rec
//        return false;
//        final Object this$recipe = this.getRecip
//        final Object other$recipe = other.getRec
//        if (this$recipe == null ? other$recipe !
//        return true;
//    }
//    protected boolean canEqual(final Object othe
//        return other instanceof Notes;
//                }
//                public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $id = this.getId();
//        result = result * PRIME + ($id == null ?
//        final Object $recipeNotes = this.getReci
//        result = result * PRIME + ($recipeNotes
//        final Object $recipe = this.getRecipe();
//        result = result * PRIME + ($recipe == nu
//        return result;
//    }
//    public String toString() {
//        return "Notes(id=" + this.getId() + ", r
//    }
//}
