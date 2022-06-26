package Battle_Of_Mesoketes.Databases;

import Battle_Of_Mesoketes.Models.Country;
import Battle_Of_Mesoketes.Walls.GroupWalls;

public class GroupCountryWalls {
        // this class is to map the country with the walls on four directions
        private Country country;
        private GroupWalls groupWalls;

        public Country getCountry() {
                return country;
        }

        public void setCountry(Country country) {
                this.country = country;
        }

        public GroupWalls getGroupWalls() {
                return groupWalls;
        }

        public void setGroupWalls(GroupWalls groupWalls) {
                this.groupWalls = groupWalls;
        }

}
