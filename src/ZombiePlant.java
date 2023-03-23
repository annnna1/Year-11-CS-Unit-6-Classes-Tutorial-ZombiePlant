public class ZombiePlant
{
    private int potency;
    private int treatment;

    public ZombiePlant (int  potency, int treatment)
    {
        this.potency = potency;
        this.treatment = treatment;
    }
    public int getPotencyRequired ()
    {
        return potency;
    }
    public int treatmentsNeeded ()
    {
        return treatment;
    }
    public boolean isDangerous ()
    {
        if (treatment>0)
            return true;
        else
            return false;
    }
    public void treat (int potency)
    {
        if(!(potency == 0))
        {
            if (potency <= this.potency && treatment > 0 && potency > 0)
            {
                treatment--;
            }
            else if (!(potency <= this.potency && (treatment == 0 || potency < 0)))
            {
                treatment++;
            }
        }
    }
}
