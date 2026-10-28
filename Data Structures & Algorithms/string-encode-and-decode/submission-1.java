class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length())
              .append('#')
              .append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < encoded.length()) {
            int delimiter = encoded.indexOf('#', i);
            int length = Integer.parseInt(encoded.substring(i, delimiter));

            int start = delimiter + 1;
            int end = start + length;

            result.add(encoded.substring(start, end));
            i = end;
        }

        return result;
    }
}