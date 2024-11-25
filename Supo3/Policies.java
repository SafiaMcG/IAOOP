class PolicyHolder  {
    private String name;
    private int age;

    public PolicyHolder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Policy {
    private PolicyHolder policyHolder;

    public Policy(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    // SRP violation
    public double calculatePremium (double coverageAmount, double carValue) {
        if (this instanceof LifeInsurancePolicy) {
            if (policyHolder.getAge() < 35) {
                return coverageAmount * 0.05;
            } else {
                return coverageAmount * 0.1;
            }
        } else if (this instanceof CarInsurancePolicy) {
            if (policyHolder.getAge() > 30) {
                return carValue * 0.1;
            } else {
                return carValue * 0.2;
            }
        }
    }
}

class LifeInsurancePolicy extends Policy {
    public LifeInsurancePolicy(PolicyHolder policyHolder) {
        super(policyHolder);
    }
}

class CarInsurancePolicy extends Policy {
    public CarInsurancePolicy(PolicyHolder policyHolder) {
        super(policyHolder);
    }

    // LSP violation
    @Override
    public double calculatePremium(double coverageAmount, double carValue) {
        if (policyHolder.getAge() < 18) {
            throw new IllegalArgumentException("Car insurance can only be issued for adults.");
        }

        if (policyHolder.getAge() > 30) {
            return carValue * 0.1;
        } else {
            return carValue * 0.20;
        }
    }
}