package com.company;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class HangmanGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel secretWord;
    private HangmanList hangman;
    private JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    private HangmanDrawing drawing;

    /**
     * Запуск приложения
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HangmanGUI frame = new HangmanGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Создание окна
     */
    public HangmanGUI() {
        setTitle("Виселица");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 399);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        hangman = new HangmanList();
        drawing = new HangmanDrawing(hangman);
        drawing.setBounds(10, 0, 289, 246);
        contentPane.add(drawing);

        //Создание кнопок для букв
        a = new JButton("a");
        a.addActionListener(new ActionListener() {
            //Если происходит нажатие на букву 'a'
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('a');
                secretWord.setText(hangman.getHashed().toString());
                //Обновление рисунка
                repaint();
                //Проверка игры на завершение
                hangman.checkGame();
                //Вывод на экран сообщения
                displayMessage();
                //Делаем букву 'а' недоступной
                a.setEnabled(false);
            }
        });
        //Устанавливаем кнопку на координаты 10,257 с шириной 41 и высотой 38
        a.setBounds(10, 257, 41, 38);
        contentPane.add(a); //Добавляем кнопку на панель

        //АНАЛОГИЧНО СО ВСЕМИ ОСТАЛЬНЫМИ КНОПКАМИ

        b = new JButton("b");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('b');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                b.setEnabled(false);
            }
        });
        b.setBounds(59, 257, 41, 38);
        contentPane.add(b);

        c = new JButton("c");
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('c');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                c.setEnabled(false);
            }
        });
        c.setBounds(108, 257, 41, 38);
        contentPane.add(c);

        d = new JButton("d");
        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('d');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                d.setEnabled(false);
            }
        });
        d.setBounds(157, 257, 41, 38);
        contentPane.add(d);

        e = new JButton("e");
        e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                hangman.checkLetter('e');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                e.setEnabled(false);
            }
        });
        e.setBounds(206, 257, 41, 38);
        contentPane.add(e);

        f = new JButton("f");
        f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('f');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                f.setEnabled(false);
            }
        });
        f.setBounds(255, 257, 41, 38);
        contentPane.add(f);

        g = new JButton("g");
        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('g');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                g.setEnabled(false);
            }
        });
        g.setBounds(304, 257, 41, 38);
        contentPane.add(g);

        h = new JButton("h");
        h.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('h');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                h.setEnabled(false);
            }
        });
        h.setBounds(353, 257, 41, 38);
        contentPane.add(h);

        i = new JButton("i");
        i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('i');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                i.setEnabled(false);
            }
        });
        i.setBounds(402, 257, 41, 38);
        contentPane.add(i);

        j = new JButton("j");
        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('j');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                j.setEnabled(false);
            }
        });
        j.setBounds(451, 257, 41, 38);
        contentPane.add(j);

        k = new JButton("k");
        k.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('k');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                k.setEnabled(false);
            }
        });
        k.setBounds(500, 257, 41, 38);
        contentPane.add(k);

        l = new JButton("l");
        l.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('l');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                l.setEnabled(false);
            }
        });
        l.setBounds(549, 257, 41, 38);
        contentPane.add(l);

        m = new JButton("m");
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('m');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                m.setEnabled(false);
            }
        });
        m.setBounds(598, 257, 45, 38);
        contentPane.add(m);

        n = new JButton("n");
        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('n');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                n.setEnabled(false);
            }
        });
        n.setBounds(10, 306, 41, 38);
        contentPane.add(n);

        o = new JButton("o");
        o.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('o');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                o.setEnabled(false);
            }
        });
        o.setBounds(59, 306, 41, 38);
        contentPane.add(o);

        p = new JButton("p");
        p.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('p');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                p.setEnabled(false);
            }
        });
        p.setBounds(108, 306, 41, 38);
        contentPane.add(p);

        q = new JButton("q");
        q.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('q');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                q.setEnabled(false);
            }
        });
        q.setBounds(157, 306, 41, 38);
        contentPane.add(q);

        r = new JButton("r");
        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('r');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                r.setEnabled(false);
            }
        });
        r.setBounds(206, 306, 41, 38);
        contentPane.add(r);

        s = new JButton("s");
        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('s');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                s.setEnabled(false);
            }
        });
        s.setBounds(255, 306, 41, 38);
        contentPane.add(s);

        t = new JButton("t");
        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('t');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                t.setEnabled(false);
            }
        });
        t.setBounds(304, 306, 41, 38);
        contentPane.add(t);

        u = new JButton("u");
        u.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('u');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                u.setEnabled(false);
            }
        });
        u.setBounds(353, 306, 41, 38);
        contentPane.add(u);

        v = new JButton("v");
        v.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('v');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                v.setEnabled(false);
            }
        });
        v.setBounds(402, 306, 41, 38);
        contentPane.add(v);

        w = new JButton("w");
        w.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('w');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                w.setEnabled(false);
            }
        });
        w.setBounds(449, 306, 44, 38);
        contentPane.add(w);

        x = new JButton("x");
        x.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('x');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                x.setEnabled(false);
            }
        });
        x.setBounds(500, 306, 41, 38);
        contentPane.add(x);

        y = new JButton("y");
        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('y');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                y.setEnabled(false);
            }
        });
        y.setBounds(549, 306, 41, 38);
        contentPane.add(y);

        z = new JButton("z");
        z.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hangman.checkLetter('z');
                secretWord.setText(hangman.getHashed().toString());
                repaint();
                hangman.checkGame();
                displayMessage();
                z.setEnabled(false);
            }
        });
        z.setBounds(600, 306, 41, 38);
        contentPane.add(z);

        secretWord = new JLabel("",SwingConstants.CENTER);
        secretWord.setBounds(304, 148, 284, 53);
        secretWord.setFont(new Font("Serif", Font.PLAIN, 34));;
        secretWord.setText(hangman.getHashed().toString());
        contentPane.add(secretWord);

    }

    /**
     *  Сообщение, выводящееся в конце игры о победе или поражении
     */
    public void displayMessage() {
        if(hangman.getStatus()==true) {
            JOptionPane.showMessageDialog(this, "Поздравляю, ты выиграл!");
            grayOut();
        } else if(hangman.getStatus()==false && hangman.getGuesses()<=0) {
            JOptionPane.showMessageDialog(this, "Ты проиграл!");
            grayOut();
        }
    }

    //Отключаем кнопки по завершению работы программы
    public void grayOut() {
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        g.setEnabled(false);
        h.setEnabled(false);
        i.setEnabled(false);
        j.setEnabled(false);
        k.setEnabled(false);
        l.setEnabled(false);
        m.setEnabled(false);
        n.setEnabled(false);
        o.setEnabled(false);
        p.setEnabled(false);
        q.setEnabled(false);
        r.setEnabled(false);
        s.setEnabled(false);
        t.setEnabled(false);
        u.setEnabled(false);
        v.setEnabled(false);
        w.setEnabled(false);
        x.setEnabled(false);
        y.setEnabled(false);
        z.setEnabled(false);
    }
}
