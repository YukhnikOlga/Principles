public class main {
    public static void main(String[] args) {
        post post = new post();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phohe = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

            post.birthday = new FormDate();

            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1999;
        }
    }