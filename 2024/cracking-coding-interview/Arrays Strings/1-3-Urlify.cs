public class Solution
{
    // O(N) space
    public string URLifyLame(string text, int size)
    {
        var x = text.Length;
        char[] chars = new char[x];
        int i = 0;
        int charsPos = 0;
        while (i < size && charsPos < chars.Length)
        {
            if (text[i] == ' ')
            {
                chars[charsPos] = '%';
                chars[charsPos + 1] = '2';
                chars[charsPos + 2] = '0';
                i++;
                charsPos += 3;
            }
            else
            {
                chars[charsPos] = text[i];
                i++;
                charsPos++;

            }
        }
        return string.Join("", chars);
    }
    // O(1) space and O(N) time
    public string URLify(string str, int size)
    {

        char[] text = str.ToCharArray();
        var numberOfSpaces = countOfChar(text, 0, size, ' ');
        int newIndex = size - 1 + numberOfSpaces * 2;

        for (int oldIndex = size - 1; oldIndex >= 0; oldIndex -= 1)
        {
            if (text[oldIndex] == ' ')
            {
                text[newIndex] = '%';
                text[newIndex - 1] = '2';
                text[newIndex - 2] = '0';
                newIndex -= 3;
            }
            else
            {
                text[newIndex] = text[oldIndex];
                newIndex--;

            }
        }
        return string.Join("", text);
    }

    private int countOfChar(char[] c, int start, int end, int target)
    {
        int count = 0;
        for (int i = start; i < end; i++)
        {
            if (c[i] == target)
            {
                count++;
            }
        }
        return count;
    }
}
