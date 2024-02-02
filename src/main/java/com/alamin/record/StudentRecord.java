package com.alamin.record;

import java.io.Serializable;

public record StudentRecord(int id, String name, float cgpa) implements Serializable {
    /**
     * Record class is hold the two types of constructor
     * 1. Canonical-Constructor
     * 2. Compact-Constructor
     * Only used the Canonical-Constructor or Compact-Constructor
     */

    // TODO: 01/02/2024 This is Canonical-Constructor
//    public StudentRecord(int id, String name, float cgpa){
//        // TODO: 01/02/2024 We can check any validation for fields
//        if (cgpa < 0.00 || 4.00 < cgpa){
//            throw new IllegalStateException("Invalid cgpa....");
//        }
//        this.id = id;
//        this.name = name;
//        this.cgpa = cgpa;
//    }
    // TODO: 01/02/2024 This is not support Canonical-Constructor because parameters name difference the Components List
    // TODO: 01/02/2024 Constructors parameters should be same the header (Component List name)
//    public StudentRecord(int id1, String name, float cgpa){
//        // TODO: 01/02/2024 We can check any validation for fields
//        if (cgpa < 0.00 || 4.00 < cgpa){
//            throw new IllegalStateException("Invalid cgpa....");
//        }
//        this.id = id1;
//        this.name = name;
//        this.cgpa = cgpa;
//    }
    // TODO: 01/02/2024 This is Compact-Constructor using the validation of the fields, Most use the compact-constructor
    public StudentRecord{
        if (cgpa < 0.00 || 4.00 < cgpa){
            throw new IllegalStateException("Invalid cgpa....");
        }
    }

    // TODO: 01/02/2024 Compact-constructor can chaining
//    public StudentRecord{
//        if (cgpa < 0.00 || 4.00 < cgpa){
//            throw new IllegalStateException("Invalid cgpa....");
//        }
//    }
//    public StudentRecord(){
//        this(0, null, 0.0f);
//    }
    // TODO: 01/02/2024 Compact-constructor can not possible chaining the below
//    public StudentRecord{
//        if (cgpa < 0.00 || 4.00 < cgpa){
//            throw new IllegalStateException("Invalid cgpa....");
//        }
//        this.id = id;
//        this.name = name;
//        this.cgpa = cgpa;
//    }
//    public StudentRecord(int id, String name, float cgpa){
//        this(id, name, cgpa);
//    }
}
