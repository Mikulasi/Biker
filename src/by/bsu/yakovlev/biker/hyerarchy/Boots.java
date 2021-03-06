package by.bsu.yakovlev.biker.hyerarchy;

    public class Boots extends Ammunition {

        public enum BootsType {
            SPORT_BOOTS, ENDURO_BOOTS, TOURIST_BOOTS, STREET_BOOTS, CHOPPER_BOOTS
        }

        private BootsType bootsType;

        public Boots(int price, double weight, String companyName, String color, BootsType bootsType) {
            super(price, weight, companyName, color);
            this.bootsType = bootsType;
        }

        public BootsType getBootsType() {
            return bootsType;
        }

        public String toString() {
            return "Boots price: " + getPrice() + ",Boots weight: " + getWeight() + ",Boots company name: " + getCompanyName() +
                    ",Boots color: " + getColor() + ", Boots type: " + getBootsType();
        }
    }
