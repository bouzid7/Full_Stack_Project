import { ReactNode } from "react";
import { Link } from "react-router-dom";

type LayoutProps = {
  children: ReactNode;
};

const Layout = ({ children }: LayoutProps) => {
  return (
    <div className="h-screen bg-base-300">
      <nav className="navbar bg-base-200 sticky top-0">
        <Link to="/" className="btn btn-ghost">

          <img
            src="https://ukauto.fr/wp-content/uploads/2018/03/Marque-de-voiture-fran%C3%A7aise-de-luxe-Bugatti2.jpg"
            alt="Logo of car company"
            className="w-10"
          />
        </Link>
        <Link to="/cars/add" className="btn btn-ghost" >
          Ajouter Voiture
        </Link>
        <Link to="/cars" className="btn btn-ghost">
          Liste Voitures
        </Link>
      </nav>
      {children}
      <footer className="footer footer-center  bg-base-200 p-5 fixed bottom-0 ">
          <p className="footer-title">2023-All rights reserved Idsit <br/> Realised by BOUZID Abdelfattah</p>
      </footer>
    </div>
  );
};
export default Layout;
