package domain;

public class Contact {
    private String email;
    private boolean favoriet = false;
    private int ontvangenMails;
    public Contact(String email, boolean favoriet)
    {
        this.setEmail(email);
        this.setFavoriet(favoriet);
    }

    private void setEmail(String email) {
        if(email.isBlank() || !email.contains("@") || ! email.contains("."))
            throw new IllegalArgumentException("Check de parameter");
        this.email = email;
    }

    private void setFavoriet(boolean favoriet) {
        this.favoriet = favoriet;
    }

    public boolean isFavoriet() {
        return favoriet;
    }

    public void ophogenOntvangenMails(int x)
  {if(x<=0)
      throw new IllegalArgumentException("Check de parameter");
      ontvangenMails +=x;

  }

    public int getOntvangenMails() {
        return ontvangenMails;
    }

    public String getEmail() {
        return email;
    }

    public void reset()
  {
      ontvangenMails = 0;
  }

    public String getFavoriet() {
        if(this.favoriet == false)
        {
            return "geen favoriet";
        }
        return "favoriet";
    }
}
