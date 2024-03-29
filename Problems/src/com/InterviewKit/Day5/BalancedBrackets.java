package com.InterviewKit.Day5;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {

        //{[()]}
        //{[(])}
        //}][}}(}][))]
        List<String> input = Arrays.asList("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]", "[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}", "(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]", "){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]", "}(]}){", "((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{(", "{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())", "(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]", "()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])", "[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){][", "{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}", "()(){{}}[()()]{}{}", "{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])", "{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})", "][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{", "{{}(", "{[{((({}{({({()})()})[]({()[[][][]]}){}}))){}}]}{}{({((){{}[][]{}[][]{}}[{}])(())}[][])}", "()[[][()[]][]()](([[[(){()[[]](([]))}]]]))", "()[]({}{})(()){{{}}()()}({[]()}())[](){}(({()}[{}[{({{}}){({}){({})((({()})))}}}]]))", "}[{){({}({)})]([}{[}}{[(([])[(}){[]])([]]}(]]]]{][", "[{]{[{(){[}{}(([(]}])(){[[}(]){(})))}}{{)}}{}][({(}))]}({)", ")})[(]{][[())]{[]{{}}[)[)}[]){}](}({](}}}[}{({()]]", "[[[({[]}({[][[[[][[{(()[][])}()[][]][]{}]]]]}))][(()){}]]]()[{}([]{}){}{{}}]", "({[]({[]})}())[][{}[{{(({{{([{}])}}}))}}]]", "([((()))()])[][][]{}()(([]))[]()[]((){}[]){}(){{}[]}[[{[]}]]", "[[(((({}{[]{}()}){}{{}}){({[]{[{}]{(){}(((){()}))}()}}[[]]()()[()])[[{}{}]()]}))]]{}[]{}({({{}})})", "(]{()}((", "[][(())[({{{()[]}}{[[][[][[[]{{{[()]{{{{}{[]}[][]}}}}}}]]]]}})]]", "}[})})}[)]{}{)", "({(}{})))}(}[)[}{)}}[)[{][{(}{{}]({}{[(})[{[({{[}{(]]})}", "]}})[]))]{][])[}(])]({[]}[]([)", "[{{}{[{{[}[[}([]", "[([]){}][({})({[(([])[][])][[{}{([{{}{(()){{{({}{{}}())}}[]}}()[()[{{{([](()){[[[]]]})}}}]]}])}]]})]", "]{}{(}))}](})[{]]()(]([}]([}][}{]{[])}{{{]([][()){{})[{({{{[}{}](]}}", "{[{}}){(}[][)(}[}][)({[[{]}[(()[}}){}{)([)]}(()))]{)(}}}][", "(]{}{(}}}[)[", "[]{}{[[]]}([{}]{}[]){{(())}}", "[)([{(][(){)[)}{)]]}}([((][[}}(]{}]]}]][(({{{))[[){}{]][))[]{]][)[{{}{()]){)])))){{{[(]}[}}{}]", "{({(){[[[][]{}[[([]{})]{}]][[]()()]]}})}[{}{{}}]", ")}][(})){))[{}[}", "{[]{({]}[}}[{([([)([){{}{(}}[]}}[[{[}[[()(])[}[]", "()()()[]", "((){}])][]][}{]{)]]}][{]}[)(])[}[({(", ")[((])(]]]]((]){{{{())]}]}(}{([}(({}]])[[{){[}]{{}})[){(", "}][[{[((}{[]){}}[[[)({[)}]]}(]]{[)[]}{}(){}}][{()]))})]][(((}}", "([]){}{{}{}}()([([{}{[[]()([(([]()))()[[]]])]}])])", "[()[[]{{[]}()([])}[]][][]][]()[]{}{}[][]{}{}[()(){}]", "{[{){]({(((({](]{([])([{{([])[}(){(]](]{[{[]}}())[){})}))[{})))[", "{}[()[]][]{}{}[[{{[[({})]()[[()]]]}}]]", "{[{}[][]]}[((()))][]({})[]{}{()}", "(){[{({})}]}", "([]])][{)]({)[]))}]())[}]))][}{(}}})){]}]{[)}(][})[[", "((({{}(([{}(())]))[()]{[[[]()]]}})))", "}()))}(}]]{{})}][{](]][{]{[[]]]}]]}([)({([))[[(]}])}[}(([{)[)]]([[](]}]}{]{{})[]){]}{])(", "{}{}{}{[[()]][]}", ")]}]({{})[[[{]{{{}}][))]{{", "))){({}])}])}}]{)()(}(]}([", "([[]][])[[]()][]()(([[]]{[()[]{[][{}]}[()]]{}{[]}}{{}()}(()[([][]{})[[{}][]]{}[]])))", "(]{[({}[){)))}]{[{}][({[({[]))}[}]}{()(([]{]()}})}[]{[)](((]]])([]}}]){)(([]]}[[}[", "([[]])({}(([(){{}[{}]}]){[{}]}))[][{}{}](){}", "[][][][][][([])][]{({()}[[()()]{([(){[]{}}{(())}{[](){}()({}())}[({}[[]()])][]])}])}", "}[{{(}})}}(((())()({]{([]((][(({)[({[]]}[])}]{][{{}]{)][}(])}}}))}}}", "[]({})()[]{}{}[]({}{})[]{([])()[()][{()({})[{}{[[()]{}[]][]}(({{[]{()()()}{}[]()}[]}){{}{}})]}]}", "{{(([{)]{}({][{](){({([[[][)}[)})(", "[{}]{[()({[{}]})]}", "[[{}]]", "]{{({[{]}[[)]]}{}))}{){({]]}{]([)({{[]){)]{}){){}()})(]]{{])(])[]}][[()()}", "{[([}[[{{(]]][}()())]{){(){)]]){})}]{][][(}[]())[}[)})})[][{[)[})()][]))}[[}", "]()])}[}}}{]]{)[}(}]]])])}{(}{([{]({)]}])(})[{}[)]])]}[]{{)){}{()}]}((}}{({])[}])[]}", "(]}[{}{{][}))){{{([)([[])([]{[", "{(()[]){}}(){[]}({{}(()())})([]){}{}(())()[()]{}()", "{{}[{}[{}[]]]}{}({{[]}})[[(){}][]]{}(([]{[][]()()}{{{()()}{[]}({}[]{()})}{()}[[]][()]}))", "{[][]}[{}[](){}]{{}{[][{}]}}", "()(){}(){((){}[])([[]]())}", "{}[[{[((}[(}[[]{{]([(}]][[", "{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]", "{[](}([)(])[]]})()]){[({]}{{{)({}(][{{[}}(]{", "[][]{{}[](())}{}({[()]}())[][[][({}([{}]))]]", "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}");
        int i = 1;
        for (String inp : input) {
            System.out.println(isBalanced(inp));
            i++;
        }
        // System.out.println(isBalanced("}][}}(}][))]"));
    }

    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('}', '{');
        pairs.put(']', '[');
        pairs.put(')', '(');
        for (int i = 0; i < s.length(); i++) {
            if (pairs.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || pairs.get(s.charAt(i)) != stack.peek()) {
                    return "NO";
                } else {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
